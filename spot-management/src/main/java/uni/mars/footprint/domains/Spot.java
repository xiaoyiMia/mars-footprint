package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record Spot(int id, int cityId, int categoryId, @NonNull String name, GeoLocation geoLocation,
                   @NonNull String address, String description, @NonNull PlaceStatus status) {
}
