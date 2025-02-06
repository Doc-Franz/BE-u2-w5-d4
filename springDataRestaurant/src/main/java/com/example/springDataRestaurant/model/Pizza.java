package com.example.springDataRestaurant.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("pizza")
public class Pizza extends Article{

    @ManyToMany(mappedBy = "pizzaList")
    List<Topping> toppingList;

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        this.toppingList = new ArrayList<Topping>();
    }

    public void addTopping(Topping topping){
        this.toppingList.add(topping);
    }
}
