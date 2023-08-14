package uni.mars.footprint.domains;

import org.springframework.lang.NonNull;

public record Category(int id, @NonNull String name) {
}
