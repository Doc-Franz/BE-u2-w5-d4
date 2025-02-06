package com.example.springDataRestaurant.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pizza extends Article{

  //Topping topping;

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        //this.topping = null;
    }

    public void addTopping(Topping topping){
        this.topping = topping;
    }
}
