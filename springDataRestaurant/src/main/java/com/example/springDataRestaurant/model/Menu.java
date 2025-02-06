package com.example.springDataRestaurant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menù")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "menu")
    private List<Article> menuList = new ArrayList<Article>();

    public void addToMenu(Article article){
        this.menuList.add(article);
    }

    public void printMenu(){
        menuList.forEach(ele -> System.out.println("name: " + ele.getName() + ", calories: " + ele.getCalories() + ", price: " + ele.getPrice() + "€"));
    }
}
