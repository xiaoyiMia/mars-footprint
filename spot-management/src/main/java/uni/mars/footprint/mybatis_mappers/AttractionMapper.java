package uni.mars.footprint.mybatis_mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import uni.mars.footprint.domains.Attraction;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.mybatis_mappers.result_maps.AttractionResultMap;

import java.util.List;

@Mapper
public interface AttractionMapper {
    @Select("SELECT spots.*, attractions.id as attraction_id, attractions.time_in_hours FROM spots LEFT JOIN attraction_spots attractions on spots.id = attractions.id WHERE spots.city_id = #{cityId} AND spots.status = #{status}")
    @ResultMap(AttractionResultMap.RESULT_MAP_ID)
    List<Attraction> getByCity(@Param("cityId") int cityId, @Param("status") PlaceStatus status);
}
