package com.example.springshop.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    public Long id;

    @Column(name = "ITEM_NAME")
    private String name;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "STOCK")
    private int stock;

    @ManyToMany(mappedBy = "items")
    private List<Category> categoryList = new ArrayList<>();
}
