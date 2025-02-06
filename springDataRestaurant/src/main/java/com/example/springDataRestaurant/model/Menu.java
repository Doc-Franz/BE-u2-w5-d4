package com.example.springDataRestaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Article> menu;

    public Menu(){
        this.menu = new ArrayList<Article>();
    }

    public void addToMenu(Article article){
        this.menu.add(article);
    }

    public void printMenu(){
        menu.forEach(ele -> System.out.println("name: " + ele.getName() + ", calories: " + ele.getCalories() + ", price: " + ele.getPrice() + "€"));
    }
}
