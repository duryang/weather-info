package ps.exalt.training.gor.weatherinfo.repositories;

import ps.exalt.training.gor.weatherinfo.models.City;
import ps.exalt.training.gor.weatherinfo.models.Country;
import ps.exalt.training.gor.weatherinfo.models.WeatherInfo;
import ps.exalt.training.gor.weatherinfo.models.WeatherType;

import java.util.ArrayList;
import java.util.List;

public class CityRepository {

    public static List<City> cities;

    static {
        cities = new ArrayList<>();
        cities.add(new City("yerevan",
                new Country("armenia"),
                new WeatherInfo(5, WeatherType.CLOUDY, 2)));
        cities.add(new City("london",
                new Country("united Kingdom"),
                new WeatherInfo(0, WeatherType.DRIZZLE, 5)));
        cities.add(new City("ramallah",
                new Country("palestine"),
                new WeatherInfo(9, WeatherType.CLEAR, 1)));
        cities.add(new City("lyon",
                new Country("france"),
                new WeatherInfo(-4, WeatherType.SNOW, 5)));
        cities.add(new City("tokyo",
                new Country("japan"),
                new WeatherInfo(11, WeatherType.CLEAR, 0)));
    }

    public static List<City> getCities() {
        return cities;
    }

    public static City getCityByName(String name) {
        for (City c : cities){
            if (c.getName() == name)
                return c;
        }

        return null;
    }

    public static City getCityByNameAndCountry(String city, String country) {
        for (City c : cities){
            if (c.getName().equals(city) && c.getCountry() != null && c.getCountry().getName().equals(country))
                return c;
        }

        return null;
    }
}
