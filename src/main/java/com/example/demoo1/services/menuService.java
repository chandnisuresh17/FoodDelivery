package com.example.demoo1.services;

import com.example.demoo1.menu;

import java.awt.*;
import java.util.List;

public interface menuService {
    menu addToMenu(menu menuItem);
    List<menu> getMenu();
}
