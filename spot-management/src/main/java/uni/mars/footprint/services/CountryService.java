package uni.mars.footprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.Country;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.CountryMapper;

import java.util.List;

@Service
public class CountryService {
    private final CountryMapper countryRepository;

    public CountryService(@Autowired CountryMapper countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> readActiveCountries() {
        return countryRepository.getCountiesByStatus(PlaceStatus.ACTIVE);
    }
}
