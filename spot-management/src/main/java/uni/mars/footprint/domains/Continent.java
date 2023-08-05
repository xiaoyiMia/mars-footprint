package uni.mars.footprint.domains;

import lombok.Data;
import lombok.NonNull;

@Data
public class Continent {
    private int id;
    @NonNull
    private String name;
}
