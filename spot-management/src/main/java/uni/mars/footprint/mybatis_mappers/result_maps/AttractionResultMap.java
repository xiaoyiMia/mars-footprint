package uni.mars.footprint.mybatis_mappers.result_maps;

import com.google.common.collect.ImmutableList;
import org.apache.ibatis.mapping.ResultFlag;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.Configuration;
import uni.mars.footprint.domains.Attraction;
import uni.mars.footprint.domains.Spot;

public class AttractionResultMap {
    public static final String RESULT_MAP_ID = "uni.mars.footprint.mybatis_mappers.AttractionResultMap";

    public ResultMap generateResultMap(Configuration configuration) {
        ResultMapping idMapping = new ResultMapping.Builder(configuration, "id", "id", int.class)
                .columnPrefix("attraction")
                .flags(ImmutableList.of(ResultFlag.ID, ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping spotMapping = new ResultMapping.Builder(configuration, "spot")
                .javaType(Spot.class)
                .nestedResultMapId(SpotResultMap.RESULT_MAP_ID)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping timeInHoursMapping = new ResultMapping.Builder(configuration, "timeInHours", "time_in_hours", Float.class)
                .flags(ImmutableList.of(ResultFlag.ID, ResultFlag.CONSTRUCTOR))
                .build();

        return new ResultMap.Builder(
                configuration,
                RESULT_MAP_ID,
                Attraction.class,
                ImmutableList.of(idMapping, spotMapping, timeInHoursMapping)
        ).build();
    }
}
