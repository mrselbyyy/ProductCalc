package com.products.productcalc.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table (name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Units unitProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id")
    private Store store;

    }
//    @ManyToMany
//    @JoinTable(
//            name = "Product_Menu"
//            , joinColumns = @JoinColumn(name = "product_id")
//            , inverseJoinColumns = @JoinColumn(name = "menu_id")
//    )
//    private List<Menu> menuList;

//    public void addMenu (Menu menu){
//        if (menuList == null){
//            menuList = new ArrayList<>();
//        }
//        menuList.add(menu);
//    }




