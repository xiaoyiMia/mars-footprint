package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record Continent(int id, @NonNull String name) {
}
