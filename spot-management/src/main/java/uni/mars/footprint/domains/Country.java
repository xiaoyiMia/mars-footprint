package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record Country(int id, int continentId, @NonNull String name, @NonNull GeoLocation geoLocation,
                      String description, @NonNull PlaceStatus status) {
}
