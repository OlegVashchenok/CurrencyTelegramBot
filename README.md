# CurrencyTelegramBot

Приклад простого телеграм боту який по запиту повератає курс доллара який отримується виконуючи порсинг сайту мінфіну та поточну погоду в Києві отримуючи
її з одного із відкритих api для погоди.

Для запуску:
docker build . -t telegram_bot
docker run telegram_bot

В проєкті використано java 11, maven, jsoup, gson, telegrambots, okhttp
