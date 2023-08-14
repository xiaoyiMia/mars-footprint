package uni.mars.footprint.mybatis_mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import uni.mars.footprint.domains.Category;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("SELECT * FROM categories")
    List<Category> getAllCategories();
}
