package com.example.pathfinder.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home(Model model) {
        return "index";

//    model.addAttribute("mostCommented", route);
//        return "index";
    }
}
