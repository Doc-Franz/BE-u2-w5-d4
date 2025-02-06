package com.example.springDataRestaurant.runner;

import com.example.springDataRestaurant.model.Menu;
import com.example.springDataRestaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    MenuService menuService;

    @Override
    public void run(String... args) throws Exception {
        Menu m = menuService.createMenu();
        m.printMenu();
    }
}
