package uni.mars.footprint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("uni.mars.footprint.mybatis_mappers")
public class SpotManagementMyBatisConfig {
}
