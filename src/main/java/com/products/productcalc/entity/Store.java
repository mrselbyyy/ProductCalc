package com.products.productcalc.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "store")
@ToString(exclude = "productList")
public class Store {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    private Long id;

    @Enumerated(EnumType.STRING)
    private StoreType storeType;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "unit")
    private Units unitStore ;

    @OneToMany(mappedBy = "store"
        ,fetch = FetchType.EAGER
    )
    private List<Product> productList;


}
