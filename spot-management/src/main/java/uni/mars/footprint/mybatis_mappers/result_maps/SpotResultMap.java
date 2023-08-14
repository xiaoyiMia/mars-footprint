package uni.mars.footprint.mybatis_mappers.result_maps;

import com.google.common.collect.ImmutableList;
import org.apache.ibatis.mapping.ResultFlag;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import uni.mars.footprint.domains.GeoLocation;
import uni.mars.footprint.domains.PlaceStatus;
import uni.mars.footprint.domains.Spot;

public class SpotResultMap {
    public static final String RESULT_MAP_ID = "uni.mars.footprint.mybatis_mappers.SpotResultMap";
    public ResultMap generateResultMap(Configuration configuration) {
        ResultMapping idMapping = new ResultMapping.Builder(configuration, "id", "id", int.class)
                .flags(ImmutableList.of(ResultFlag.ID, ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping cityMapping = new ResultMapping.Builder(configuration, "cityId", "city_id", int.class)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping categoryMapping = new ResultMapping.Builder(configuration, "categoryId", "category_id", int.class)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping nameMapping = new ResultMapping.Builder(configuration, "name", "name", String.class)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping geoLocationMapping = new ResultMapping.Builder(configuration, "geoLocation")
                .javaType(GeoLocation.class)
                .nestedResultMapId(GeoLocationResultMap.RESULT_MAP_ID)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping addressMapping = new ResultMapping.Builder(configuration, "address", "address", String.class)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping descriptionMapping = new ResultMapping.Builder(configuration, "description", "description", String.class)
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();
        ResultMapping statusMapping = new ResultMapping.Builder(configuration, "status", "status", PlaceStatus.class)
                .typeHandler(new EnumOrdinalTypeHandler<>(PlaceStatus.class))
                .flags(ImmutableList.of(ResultFlag.CONSTRUCTOR))
                .build();

        return new ResultMap.Builder(
                configuration,
                RESULT_MAP_ID,
                Spot.class,
                ImmutableList.of(idMapping, cityMapping, categoryMapping, nameMapping, geoLocationMapping, addressMapping, descriptionMapping, statusMapping)
        ).build();
    }
}
