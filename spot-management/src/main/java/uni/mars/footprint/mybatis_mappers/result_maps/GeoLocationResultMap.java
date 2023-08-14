package uni.mars.footprint.mybatis_mappers.result_maps;

import com.google.common.collect.ImmutableList;
import org.apache.ibatis.mapping.ResultFlag;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.Configuration;
import uni.mars.footprint.domains.GeoLocation;

public class GeoLocationResultMap {
    public static final String RESULT_MAP_ID = "uni.mars.footprint.mybatis_mappers.GeoLocationResultMap";
    public ResultMap generateResultMap(Configuration configuration) {
        ResultMapping longitudeMapping = new ResultMapping.Builder(configuration, "longitude", "longitude", double.class)
                .flags(ImmutableList.of(ResultFlag.ID, ResultFlag.CONSTRUCTOR))
                .build();

        ResultMapping latitudeMapping = new ResultMapping.Builder(configuration, "latitude", "latitude", double.class)
                .flags(ImmutableList.of(ResultFlag.ID, ResultFlag.CONSTRUCTOR))
                .build();

        return new ResultMap.Builder(
                configuration,
                RESULT_MAP_ID,
                GeoLocation.class,
                ImmutableList.of(longitudeMapping, latitudeMapping)
        ).build();
    }
}
