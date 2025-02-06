package com.example.springDataRestaurant.service;

import com.example.springDataRestaurant.model.Menu;
import com.example.springDataRestaurant.model.Pizza;
import com.example.springDataRestaurant.repository.ArticleDaoRepository;
import com.example.springDataRestaurant.repository.MenuDaoRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    @Qualifier("menu")
    ObjectProvider<Menu> menuProvider;

    @Autowired
    @Qualifier("pizza margherita")
    ObjectProvider<Pizza> pizzaProvider;

    @Autowired
    ArticleDaoRepository db;

    @Autowired
    MenuDaoRepository menuDaoRepository;

    public Menu createMenu(){
        return menuProvider.getObject();
    }

    public Pizza createPizza(){
        return pizzaProvider.getObject();
    }

    public void saveMenu(Menu m){
        menuDaoRepository.save(m);
    }
}
