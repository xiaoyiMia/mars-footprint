package uni.mars.footprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uni.mars.footprint.domains.Attraction;
import uni.mars.footprint.services.AttractionService;

import java.util.List;

@RestController
public class AttractionController {
    private final AttractionService attractionService;

    public AttractionController(@Autowired AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/cities/{city_id}/attractions")
    public List<Attraction> readActiveByCity(@PathVariable("city_id") int cityId) {
        return attractionService.readActiveAttractionsByCity(cityId);
    }
}
