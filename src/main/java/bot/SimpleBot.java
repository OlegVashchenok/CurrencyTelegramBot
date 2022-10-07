package bot;

import Utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import parser.CurrencyParser;
import weather.WeatherHelper;

import java.util.ResourceBundle;

public class SimpleBot extends TelegramLongPollingBot {

    private static final Logger log = LoggerFactory.getLogger(SimpleBot.class);
    private static ResourceBundle config = Utils.getPropertiesFile();

    @Override
    public String getBotUsername() {
        return config.getString("BotName");
    }

    @Override
    public String getBotToken() {
        return config.getString("BotToken");
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String textFromUser = update.getMessage().getText();

            Long userId = update.getMessage().getChatId();
            String userFirstName = update.getMessage().getFrom().getFirstName();
            log.info("[{}, {}] : {}", userId, userFirstName, textFromUser);
            String text = null;
            switch (textFromUser) {
                case "/currency":
                    text = "Привіт, " + userFirstName + " курс в обмінниках зараз: " +
                            new CurrencyParser().getCurrentCurrentUSD() + " Грн за доллар";
                    break;
                case "/weather":
                    var weather = new WeatherHelper().GetWeather().getData().get(0);
                    text = "Привіт, " + userFirstName + " погода в києві зараз " +
                            weather.getTemp() + " " + weather.getWeather().getDescription();
                    break;
            }
            SendMessage sendMessage = SendMessage.builder()
                    .chatId(userId.toString())
                    .text(text)
                    .build();
            try {
                this.sendApiMethod(sendMessage);
            } catch (TelegramApiException e) {
                log.error("Exception when sending message: ", e);
            }
        } else {
            log.warn("Unexpected update from user");
        }
    }
}
