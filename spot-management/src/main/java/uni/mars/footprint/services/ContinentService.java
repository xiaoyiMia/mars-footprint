package uni.mars.footprint.services;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.Continent;

import java.util.List;

@Service
public class ContinentService {
    public List<Continent> readAllContinents() {
        return ImmutableList.of();
    }
}
