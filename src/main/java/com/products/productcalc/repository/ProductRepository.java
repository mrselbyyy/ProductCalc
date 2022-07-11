package com.products.productcalc.repository;

import com.products.productcalc.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
