package com.example.springDataRestaurant.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    protected String name;
    protected int calories;
    protected double price;

    public Article(){};

    public Article(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}
