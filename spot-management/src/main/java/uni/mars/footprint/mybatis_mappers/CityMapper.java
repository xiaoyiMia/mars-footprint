package uni.mars.footprint.mybatis_mappers;

import org.apache.ibatis.annotations.*;
import uni.mars.footprint.domains.City;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.result_maps.CityResultMap;

import java.util.List;

@Mapper
public interface CityMapper {
    @Select("SELECT * FROM cities WHERE country_id = #{countryId} AND status = #{status}")
    @ResultMap(CityResultMap.RESULT_MAP_ID)
    List<City> getByCountry(@Param("countryId") int countryId, @Param("status") PlaceStatus status);
}
