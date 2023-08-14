package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record Attraction(int id, @NonNull Spot spot, Float timeInHours){
}
