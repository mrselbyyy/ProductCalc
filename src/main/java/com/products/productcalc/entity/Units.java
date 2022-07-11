package com.products.productcalc.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "units")
public class Units {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unit_name")
    private String unitName;

//    @OneToMany(mappedBy = "unitProduct"
//            ,fetch = FetchType.EAGER
//    )
//    private List<Product> productList;
//
//    @OneToMany(mappedBy = "unitStore"
//            ,fetch = FetchType.EAGER
//    )
//    private List<Store> stores;
}
