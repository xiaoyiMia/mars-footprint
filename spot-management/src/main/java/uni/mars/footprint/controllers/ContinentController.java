package uni.mars.footprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.mars.footprint.domains.Continent;
import uni.mars.footprint.services.ContinentService;

import java.util.List;

@RestController
public class ContinentController {
    private final ContinentService continentService;

    public ContinentController(@Autowired ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping("/continents")
    public List<Continent> readAll() {
        return continentService.readAllContinents();
    }
}
