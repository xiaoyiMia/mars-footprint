package uni.mars.footprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.mars.footprint.domains.Category;
import uni.mars.footprint.mybatis_mappers.CategoryMapper;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryMapper categoryRepository;

    public CategoryService(@Autowired CategoryMapper categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> readAllCategories() {
        return categoryRepository.getAllCategories();
    }
}
