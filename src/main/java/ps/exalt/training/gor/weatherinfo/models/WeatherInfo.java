package ps.exalt.training.gor.weatherinfo.models;

public class WeatherInfo {

    public WeatherInfo(int temperatureCelsius, WeatherType weatherType, int windSpeedKPH) {
        this.temperatureCelsius = temperatureCelsius;
        this.type = weatherType;
        this.windSpeedKPH = windSpeedKPH;
    }

    private int temperatureCelsius;
    private WeatherType type;
    private int windSpeedKPH;

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        if (temperatureCelsius < -273)
            this.temperatureCelsius = -273;
        else
            this.temperatureCelsius = temperatureCelsius;
    }

    public int getTemperatureFahrenheit () {
        return (int)Math.round(temperatureCelsius * 1.8d + 32);
    }

    public WeatherType getWeatherType() {
        return type;
    }

    public void setWeatherType(WeatherType type) {
        this.type = type;
    }

    public int getWindSpeedKPH() {
        return windSpeedKPH;
    }

    public void setWindSpeedKPH(int windSpeedKPH) {
        this.windSpeedKPH = windSpeedKPH;
    }

    public int getWindSpeedMPH() {
        return (int)Math.round(windSpeedKPH * 0.621371d);
    }
}
