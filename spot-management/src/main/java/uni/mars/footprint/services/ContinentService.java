package uni.mars.footprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.Continent;
import uni.mars.footprint.mybatis_mappers.ContinentMapper;

import java.util.List;

@Service
public class ContinentService {
    private final ContinentMapper continentRepository;
    public ContinentService(@Autowired ContinentMapper continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<Continent> readAllContinents() {
        return continentRepository.getAllContinents();
    }
}
