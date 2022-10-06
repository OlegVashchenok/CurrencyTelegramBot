import parser.CurrencyParser;
import weather.WeatherHelper;

public class Main {
    public static void main(String[] args) {
       var currency =  new CurrencyParser().getCurrentCurrentUSD();
        System.out.println(currency);
        var weather =  new WeatherHelper().GetWeather();
        System.out.println(weather);
    }
}
