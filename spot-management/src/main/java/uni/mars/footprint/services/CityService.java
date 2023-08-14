package uni.mars.footprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.City;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.CityMapper;

import java.util.List;

@Service
public class CityService {
    private final CityMapper cityRepository;

    public CityService(@Autowired CityMapper cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> readActiveCitiesByCountry(int countryId) {
        return cityRepository.getByCountry(countryId, PlaceStatus.ACTIVE);
    }
}
