package com.greenfoxdi.di.Controller;

import com.greenfoxdi.di.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/useful")
public class UsefulUtilities {
    @Autowired
    UtilityService utilityService;

    @RequestMapping(value = "")
    public String MainPage() {


        return "links";
    }


    @RequestMapping(value = "/colored")
    public String randomBackground(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "colored";
    }

    @RequestMapping(value = "/email")
    public String email(Model model) {
        model.addAttribute("email", utilityService);
        return "mail";
    }
}
