package com.example.demoo1.services;


import com.example.demoo1.repository.menuRepo;
import com.example.demoo1.menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.List;

@Component
public class menuServices implements menuService{
    @Autowired
    private menuRepo m1;
    @Override
    public menu addToMenu(menu menuItem) {
        m1.save(menuItem);
        return  menuItem;
    }

    @Override
    public List<menu> getMenu() {
        return (List<menu>) m1.findAll();
    }
}
