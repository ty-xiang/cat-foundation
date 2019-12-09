package com.catfoundation.demo.controller;

import com.catfoundation.demo.entity.Cat;
import com.catfoundation.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cat")
public class CatController {

    @Autowired
    CatService catService;

    @GetMapping("/new")
    public String displayCatForm(Model model) {
        Cat cat = new Cat();
        model.addAttribute("cat", cat);
        return "new-cat";
    }

    @PostMapping("/save")
    public String addCat(Cat cat, Model model) {
        catService.save(cat);
        return "redirect:/cat/new";
    }
}
