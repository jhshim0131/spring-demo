package com.jhshim.spring.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "hello spring!");
        return "thymeleaf/text-basic";

    }
}
