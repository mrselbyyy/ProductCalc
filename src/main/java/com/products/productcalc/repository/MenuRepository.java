package com.products.productcalc.repository;

import com.products.productcalc.entity.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Long> {

    Menu findByName(String name);

    


}
