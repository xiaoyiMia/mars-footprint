package uni.mars.footprint.mybatis_mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import uni.mars.footprint.domains.Continent;

import java.util.List;

@Mapper
public interface ContinentMapper {
    @Select("SELECT * FROM continents")
    List<Continent> getAllContinents();
}
