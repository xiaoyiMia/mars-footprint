package uni.mars.footprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uni.mars.footprint.domains.City;
import uni.mars.footprint.services.CityService;

import java.util.List;

@RestController
public class CityController {
    private final CityService cityService;

    public CityController(@Autowired CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/countries/{country_id}/cities")
    public List<City> readActiveByCountry(@PathVariable("country_id") int countryId) {
        return cityService.readActiveCitiesByCountry(countryId);
    }
}
