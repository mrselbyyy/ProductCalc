package com.products.productcalc.controller;


import com.products.productcalc.dto.MenuDto;
import com.products.productcalc.entity.Menu;
import com.products.productcalc.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/menu")
@RestController
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping
    public MenuDto findById(@RequestParam Long id){
        Menu menu = menuRepository.findById(id).get();
        MenuDto dto = new MenuDto();
        dto.setId(menu.getId());
        dto.setName(menu.getName());
        dto.setPrice(menu.getPrice());
        dto.setType(menu.getType());

        return dto;
    }
}
