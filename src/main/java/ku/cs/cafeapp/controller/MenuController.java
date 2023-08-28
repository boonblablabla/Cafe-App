package ku.cs.cafeapp.controller;

import ku.cs.cafeapp.model.MenuRequest;
import ku.cs.cafeapp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenuController {
    @Autowired private MenuService menuService;

    @GetMapping
    public String getAllMenus(Model model) {
        model.addAttribute("menus", menuService.getAllMenus());
        return "menu-all";
    }

    @GetMapping("/add")
    public String getMenuForm(Model model) {
        return "menu-add";
    }

    @PostMapping("/add")
    public String createMenu(@ModelAttribute MenuRequest menu, Model model) {
        menuService.createMenu(menu);
        model.addAttribute("menus", menuService.getAllMenus());
        return "redirect:/menus";
    }

}
