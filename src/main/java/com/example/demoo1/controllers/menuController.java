package com.example.demoo1.controllers;

import com.example.demoo1.menu;
import com.example.demoo1.services.menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class menuController {
    @Autowired
    private menuService m;

    @PostMapping("/addMenu")
    public menu addMenu(@RequestBody menu m2){
        return m.addToMenu(m2);
    }
    @GetMapping("/getMenu")
    public List<menu> getMenu(){
        return m.getMenu();
    }

}
