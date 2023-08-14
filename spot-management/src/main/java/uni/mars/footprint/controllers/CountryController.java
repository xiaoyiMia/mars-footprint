package uni.mars.footprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.mars.footprint.domains.Country;
import uni.mars.footprint.services.CountryService;

import java.util.List;

@RestController
public class CountryController {
    private final CountryService countryService;

    public CountryController(@Autowired CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> readActive() {
        return countryService.readActiveCountries();
    }
}
