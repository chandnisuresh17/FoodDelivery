package com.example.demoo1;

import javax.persistence.*;

@Entity
public class orders {
    @Id
    @GeneratedValue
    private int order_id;


    private String order_name;
    @ManyToOne(fetch = FetchType.EAGER)
    private menu m;
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer c;
}

