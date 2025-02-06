package com.example.springDataRestaurant.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type")
@NoArgsConstructor
@AllArgsConstructor
@Data

public abstract class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String name;
    protected int calories;
    protected double price;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    protected Menu menu;

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
