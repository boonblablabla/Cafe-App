package ku.cs.cafeapp.service;

import ku.cs.cafeapp.entity.Category;
import ku.cs.cafeapp.entity.Menu;
import ku.cs.cafeapp.model.MenuRequest;
import ku.cs.cafeapp.repository.CategoryRepository;
import ku.cs.cafeapp.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired private MenuRepository menuRepository;
    @Autowired private CategoryRepository categoryRepository;
    @Autowired private ModelMapper modelMapper;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public void createMenu(MenuRequest request) {
        Menu record = modelMapper.map(request, Menu.class);
        Category category =
                categoryRepository.findById(request.getCategoryId()).get();
        record.setCategory(category);
        menuRepository.save(record);
    }
}
