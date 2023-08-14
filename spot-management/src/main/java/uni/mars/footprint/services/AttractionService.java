package uni.mars.footprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.Attraction;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.AttractionMapper;

import java.util.List;

@Service
public class AttractionService {
    private final AttractionMapper attractionRepository;

    public AttractionService(@Autowired AttractionMapper attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public List<Attraction> readActiveAttractionsByCity(int cityId) {
        return attractionRepository.getByCity(cityId, PlaceStatus.ACTIVE);
    }
}
