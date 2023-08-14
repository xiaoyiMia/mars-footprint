package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record City(int id, int countryId, @NonNull String name, @NonNull GeoLocation geoLocation, String description,
                   @NonNull PlaceStatus status) {
}
