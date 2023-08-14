package uni.mars.footprint;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.AutoMappingUnknownColumnBehavior;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.result_maps.*;

@Configuration
@MapperScan("uni.mars.footprint.mybatis_mappers")
public class SpotManagementMyBatisConfig implements ConfigurationCustomizer {
    @Override
    public void customize(org.apache.ibatis.session.Configuration configuration) {
        configuration.setAutoMappingUnknownColumnBehavior(AutoMappingUnknownColumnBehavior.WARNING);
        configuration.setArgNameBasedConstructorAutoMapping(true);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setLogImpl(StdOutImpl.class);
        // Register result maps
        registerResultMaps(configuration);

        // Register type handlers
        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
        typeHandlerRegistry.register(PlaceStatus.class, EnumOrdinalTypeHandler.class);
    }

    private void registerResultMaps(org.apache.ibatis.session.Configuration configuration) {
        configuration.addResultMap(new GeoLocationResultMap().generateResultMap(configuration));
        configuration.addResultMap(new CountryResultMap().generateResultMap(configuration));
        configuration.addResultMap(new CityResultMap().generateResultMap(configuration));
        configuration.addResultMap(new SpotResultMap().generateResultMap(configuration));
        configuration.addResultMap(new AttractionResultMap().generateResultMap(configuration));
    }
}
