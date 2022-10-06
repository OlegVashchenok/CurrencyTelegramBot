package weather;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

public class WeatherHelper {

    public WeatherDTO GetWeather() {
        Gson gson = new Gson();
        WeatherDTO weather = null;
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=30.59&lat=50.53")
                    .get()
                    .addHeader("X-RapidAPI-Key", "0c4d48f8d5msh22092aa0a6fd004p1b9d00jsn88d5e220a56e")
                    .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                    .build();
            var weatherResponseBody = client.newCall(request).execute().body();
            weather = gson.fromJson(weatherResponseBody.string(), WeatherDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weather;
    }

}
