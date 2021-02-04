package ps.exalt.training.gor.weatherinfo.models;

public class City {

    public City(String name, Country country, WeatherInfo weatherInfo) {
        this.name = name;
        this.country = country;
        this.weatherInfo = weatherInfo;
    }

    private String name;
    private Country country;
    private WeatherInfo weatherInfo;

    //region Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    //endregion

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof City))
            return false;

        City other = (City)o;

        if (this.getCountry() == null || other.getCountry() == null)
            return false;

        if (this.getName() == other.getName() &&
            this.getCountry().getName() == other.getCountry().getName())
            return true;
        else
        return false;
    }
}
