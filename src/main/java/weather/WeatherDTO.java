package weather;

import java.util.ArrayList;


public class WeatherDTO {
    private float count;
    private ArrayList<Data> data;

    public void setCount(float count) {
        this.count = count;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public float getCount() {
        return count;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "count=" + count +
                ", data=" + data +
                '}';
    }

    public class Data {
        private double lon;
        private double pres;
        private String timezone;
        private String ob_time;
        private String country_code;
        private float clouds;
        private float vis;
        private double wind_spd;
        private double lat;
        private String wind_cdir_full;
        private double slp;
        private String datetime;
        private float ts;
        private float h_angle;
        private double dewpt;
        private float uv;
        private float wind_dir;
        private double elev_angle;
        private float ghi;
        private float dhi;
        private float precip;
        private Weather weather;
        private String sunset;
        private double temp;
        private String sunrise;
        private double app_temp;
        private String city_name;
        private String state_code;
        private double gust;
        private String wind_cdir;
        private float dni;
        private float solar_rad;
        private float aqi;
        private ArrayList<String> sources;
        private String station;
        private float snow;
        private float rh;
        private String pod;

        public void setLon(double lon) {
            this.lon = lon;
        }

        public void setPres(double pres) {
            this.pres = pres;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public void setOb_time(String ob_time) {
            this.ob_time = ob_time;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public void setClouds(float clouds) {
            this.clouds = clouds;
        }

        public void setVis(float vis) {
            this.vis = vis;
        }

        public void setWind_spd(double wind_spd) {
            this.wind_spd = wind_spd;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public void setWind_cdir_full(String wind_cdir_full) {
            this.wind_cdir_full = wind_cdir_full;
        }

        public void setSlp(double slp) {
            this.slp = slp;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public void setTs(float ts) {
            this.ts = ts;
        }

        public void setH_angle(float h_angle) {
            this.h_angle = h_angle;
        }

        public void setDewpt(double dewpt) {
            this.dewpt = dewpt;
        }

        public void setUv(float uv) {
            this.uv = uv;
        }

        public void setWind_dir(float wind_dir) {
            this.wind_dir = wind_dir;
        }

        public void setElev_angle(double elev_angle) {
            this.elev_angle = elev_angle;
        }

        public void setGhi(float ghi) {
            this.ghi = ghi;
        }

        public void setDhi(float dhi) {
            this.dhi = dhi;
        }

        public void setPrecip(float precip) {
            this.precip = precip;
        }

        public void setWeather(Weather weather) {
            this.weather = weather;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public void setApp_temp(double app_temp) {
            this.app_temp = app_temp;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public void setState_code(String state_code) {
            this.state_code = state_code;
        }

        public void setGust(double gust) {
            this.gust = gust;
        }

        public void setWind_cdir(String wind_cdir) {
            this.wind_cdir = wind_cdir;
        }

        public void setDni(float dni) {
            this.dni = dni;
        }

        public void setSolar_rad(float solar_rad) {
            this.solar_rad = solar_rad;
        }

        public void setAqi(float aqi) {
            this.aqi = aqi;
        }

        public void setSources(ArrayList<String> sources) {
            this.sources = sources;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public void setSnow(float snow) {
            this.snow = snow;
        }

        public void setRh(float rh) {
            this.rh = rh;
        }

        public void setPod(String pod) {
            this.pod = pod;
        }

        public double getLon() {
            return lon;
        }

        public double getPres() {
            return pres;
        }

        public String getTimezone() {
            return timezone;
        }

        public String getOb_time() {
            return ob_time;
        }

        public String getCountry_code() {
            return country_code;
        }

        public float getClouds() {
            return clouds;
        }

        public float getVis() {
            return vis;
        }

        public double getWind_spd() {
            return wind_spd;
        }

        public double getLat() {
            return lat;
        }

        public String getWind_cdir_full() {
            return wind_cdir_full;
        }

        public double getSlp() {
            return slp;
        }

        public String getDatetime() {
            return datetime;
        }

        public float getTs() {
            return ts;
        }

        public float getH_angle() {
            return h_angle;
        }

        public double getDewpt() {
            return dewpt;
        }

        public float getUv() {
            return uv;
        }

        public float getWind_dir() {
            return wind_dir;
        }

        public double getElev_angle() {
            return elev_angle;
        }

        public float getGhi() {
            return ghi;
        }

        public float getDhi() {
            return dhi;
        }

        public float getPrecip() {
            return precip;
        }

        public Weather getWeather() {
            return weather;
        }

        public String getSunset() {
            return sunset;
        }

        public double getTemp() {
            return temp;
        }

        public String getSunrise() {
            return sunrise;
        }

        public double getApp_temp() {
            return app_temp;
        }

        public String getCity_name() {
            return city_name;
        }

        public String getState_code() {
            return state_code;
        }

        public double getGust() {
            return gust;
        }

        public String getWind_cdir() {
            return wind_cdir;
        }

        public float getDni() {
            return dni;
        }

        public float getSolar_rad() {
            return solar_rad;
        }

        public float getAqi() {
            return aqi;
        }

        public ArrayList<String> getSources() {
            return sources;
        }

        public String getStation() {
            return station;
        }

        public float getSnow() {
            return snow;
        }

        public float getRh() {
            return rh;
        }

        public String getPod() {
            return pod;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "lon=" + lon +
                    ", pres=" + pres +
                    ", timezone='" + timezone + '\'' +
                    ", ob_time='" + ob_time + '\'' +
                    ", country_code='" + country_code + '\'' +
                    ", clouds=" + clouds +
                    ", vis=" + vis +
                    ", wind_spd=" + wind_spd +
                    ", lat=" + lat +
                    ", wind_cdir_full='" + wind_cdir_full + '\'' +
                    ", slp=" + slp +
                    ", datetime='" + datetime + '\'' +
                    ", ts=" + ts +
                    ", h_angle=" + h_angle +
                    ", dewpt=" + dewpt +
                    ", uv=" + uv +
                    ", wind_dir=" + wind_dir +
                    ", elev_angle=" + elev_angle +
                    ", ghi=" + ghi +
                    ", dhi=" + dhi +
                    ", precip=" + precip +
                    ", weather=" + weather +
                    ", sunset='" + sunset + '\'' +
                    ", temp=" + temp +
                    ", sunrise='" + sunrise + '\'' +
                    ", app_temp=" + app_temp +
                    ", city_name='" + city_name + '\'' +
                    ", state_code='" + state_code + '\'' +
                    ", gust=" + gust +
                    ", wind_cdir='" + wind_cdir + '\'' +
                    ", dni=" + dni +
                    ", solar_rad=" + solar_rad +
                    ", aqi=" + aqi +
                    ", sources=" + sources +
                    ", station='" + station + '\'' +
                    ", snow=" + snow +
                    ", rh=" + rh +
                    ", pod='" + pod + '\'' +
                    '}';
        }
    }

    public class Weather {
        private String description;
        private float code;
        private String icon;

        public void setDescription(String description) {
            this.description = description;
        }

        public void setCode(float code) {
            this.code = code;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getDescription() {
            return description;
        }

        public float getCode() {
            return code;
        }

        public String getIcon() {
            return icon;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "description='" + description + '\'' +
                    ", code=" + code +
                    ", icon='" + icon + '\'' +
                    '}';
        }
    }

}