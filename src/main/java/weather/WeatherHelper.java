package weather;

import Utils.Utils;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import java.util.ResourceBundle;

public class WeatherHelper {
    private static ResourceBundle config = Utils.getPropertiesFile();

    public WeatherDTO GetWeather() {
        Gson gson = new Gson();
        WeatherDTO weather = null;
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(config.getString("WeatherApiUrl"))
                    .get()
                    .addHeader("X-RapidAPI-Key", config.getString("WeatherApiToken"))
                    .addHeader("X-RapidAPI-Host", config.getString("WeatherApiHost"))
                    .build();
            var weatherResponseBody = client.newCall(request).execute().body();
            weather = gson.fromJson(weatherResponseBody.string(), WeatherDTO.class);
            System.out.println(weather);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weather;
    }
}
