package ku.cs.cafeapp.service;

import ku.cs.cafeapp.entity.Menu;
import ku.cs.cafeapp.model.MenuRequest;
import ku.cs.cafeapp.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired private MenuRepository menuRepository;
    @Autowired private ModelMapper modelMapper;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public void createMenu(MenuRequest menu) {
        Menu record = modelMapper.map(menu, Menu.class);
        menuRepository.save(record);
    }
}
