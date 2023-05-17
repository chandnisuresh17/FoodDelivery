package com.example.demoo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class menu {
    @Id
    @GeneratedValue
    private int menu_id;
    private String food_item;

}
