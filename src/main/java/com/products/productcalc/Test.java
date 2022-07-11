package com.products.productcalc;

import com.products.productcalc.entity.Menu;
import com.products.productcalc.entity.Product;
import com.products.productcalc.repository.MenuRepository;
import com.products.productcalc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Test implements ApplicationRunner{
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MenuRepository menuRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Iterable<Product> result = productRepository.findAll();
//        Iterator<Product> iterator = result.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//       Menu result = menuRepository.findByName("Benedict_eggs");
//       System.out.println(result);

//        Menu menu = new Menu();
//        menu.setName("Salad");
//        menu.setPrice(500);
//        menu.setType("general");
//
//        menuRepository.save(menu);
//
//        menuRepository.deleteById(6L);

    }
}
