package com.ifsp.mateus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class ObjetoController {

    @GetMapping("/show")
    public String show(Model model) {
        Product product = new Product("Notebook", "Notebook Dell", 3500.00);

        model.addAttribute("product", product);

        return "show.html";
    }

    @GetMapping("/table")
    public String table(Model model) {
        Product tbk = new Product("To Be Kind", "Disco de vinil: To Be Kind, do Swans", 550.00);
        Product tvo = new Product("The Velvet Underground & Nico", "Disco de vinil: The Velvet Underground & Nico", 400.00);
        Product adc = new Product("A Divina Comédia", "Disco de vinil: A Divina Comédia, dos Mutantes", 250.00);
        Product cd = new Product("Cabeça Dinossauro", "Disco de vinil: Cabeça Dinossauro, dos Titãs", 80.00);
        Product rs = new Product("Rubber Soul", "Disco de vinil: Rubber Soul, dos Beatles", 50.00);


        model.addAttribute("tbk", tbk);
        model.addAttribute("tvo", tvo);
        model.addAttribute("adc", adc);
        model.addAttribute("cd", cd);
        model.addAttribute("rs", rs);

        return "table.html";
    }

    Random r = new Random();

    @GetMapping("/personagem") 
    public String personagem(Model model) {

        Personagem personagem = new Personagem("Cavaleiro da Lua", r.nextInt(21), "Mago", r.nextInt(101), true);
        model.addAttribute(personagem);

        return "personagem.html";
    }
}
