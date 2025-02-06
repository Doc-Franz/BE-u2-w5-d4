package com.example.springDataRestaurant.service;

import com.example.springDataRestaurant.model.Menu;
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
    MenuDaoRepository db;

    public Menu createMenu(){
        return menuProvider.getObject();
    }

    public void updateMenu(Menu menu){
        db.save(menu);
        System.out.println("Menù salvato!");
    }
}
