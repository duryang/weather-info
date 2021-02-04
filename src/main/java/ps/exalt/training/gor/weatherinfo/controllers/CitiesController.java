package ps.exalt.training.gor.weatherinfo.controllers;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.exalt.training.gor.weatherinfo.models.City;
import ps.exalt.training.gor.weatherinfo.models.WeatherInfo;
import ps.exalt.training.gor.weatherinfo.repositories.CityRepository;

import java.util.Locale;

@RestController
public class CitiesController {

    @RequestMapping("{country}/{city}")
    public String get(@PathVariable String country, @PathVariable String city) {
        country = country.toLowerCase();
        city = city.toLowerCase();
        City c = CityRepository.getCityByNameAndCountry(city, country);

        if (c == null || c.getWeatherInfo() == null)
            return "City not found.";

        WeatherInfo w = c.getWeatherInfo();
        String t = StringUtils.capitalize(w.getWeatherType().toString().replace('_', ' ').toLowerCase());

        return t + " in " + StringUtils.capitalize(c.getName()) + ", " +
                StringUtils.capitalize(c.getCountry().getName()) + ". " +
                "Temperature is " + w.getTemperatureCelsius() + "\u00B0C (" +
                w.getTemperatureFahrenheit() + "\u00B0F). " +
                "Wind speed is " + w.getWindSpeedKPH() + " kph (" +
                w.getWindSpeedMPH() + " mph).";
    }
}
