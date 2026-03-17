package com.ifsp.mateus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjetoController {

    @GetMapping("/show")
    public String show(Model model) {
        Product product = new Product("Notebook", "Notebook Dell", 3500.00);

        model.addAttribute("product", product);

        return "show.html";
    }
}
