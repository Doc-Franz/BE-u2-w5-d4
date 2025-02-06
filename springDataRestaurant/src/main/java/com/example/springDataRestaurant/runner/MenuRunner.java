package com.example.springDataRestaurant.runner;

import com.example.springDataRestaurant.model.Menu;
import com.example.springDataRestaurant.model.Pizza;
import com.example.springDataRestaurant.service.ArticleService;
import com.example.springDataRestaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    MenuService menuService;

    @Autowired
    ArticleService articleService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner...");
        //Pizza m = menuService.createPizza();
        Menu menu = menuService.createMenu();

        //articleService.saveArticle(m);
        menuService.saveMenu(menu);
    }
}
