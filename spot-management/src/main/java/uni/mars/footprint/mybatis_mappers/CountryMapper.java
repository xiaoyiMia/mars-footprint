package uni.mars.footprint.mybatis_mappers;

import org.apache.ibatis.annotations.*;
import uni.mars.footprint.domains.Country;
import uni.mars.footprint.domains.GeoLocation;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.result_maps.CountryResultMap;
import uni.mars.footprint.mybatis_mappers.result_maps.GeoLocationResultMap;

import java.util.List;

@Mapper
public interface CountryMapper {
    @Select("SELECT * FROM countries")
    @ResultMap(CountryResultMap.RESULT_MAP_ID)
    List<Country> getAllCountries();

    @Select("SELECT * FROM countries WHERE status = #{status}")
    @ResultMap(CountryResultMap.RESULT_MAP_ID)
    List<Country> getCountiesByStatus(@Param("status") PlaceStatus status);
}
