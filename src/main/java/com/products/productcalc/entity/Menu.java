package com.products.productcalc.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "type")
    private String type;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (
            name = "product_menu"
            , joinColumns = @JoinColumn (name = "menu_id")
            , inverseJoinColumns = @JoinColumn (name = "product_id")
    )
    private List<Product> productList;

    public void addProduct(Product product) {
        if (productList == null) {
            productList = new ArrayList<>();
        }
        productList.add(product);
    }

}
