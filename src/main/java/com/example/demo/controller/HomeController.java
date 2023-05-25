package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "home/index";
    }
    @GetMapping("/add")
    public String addBookForm (Model model){
        model.addAttribute("book", new Book());
        return "book/add";
    }



}
