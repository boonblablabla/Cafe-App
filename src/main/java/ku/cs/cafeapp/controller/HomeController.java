/*
 * Matupol 6310450638
 */

package ku.cs.cafeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawasdee");
        return "home";
    }
}
