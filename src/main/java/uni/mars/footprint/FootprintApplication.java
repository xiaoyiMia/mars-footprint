package uni.mars.footprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SpotManagementComponentScanConfig.class)
public class FootprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootprintApplication.class, args);
	}
}
