package com.example.springDataRestaurant.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("drink")
public class Drink extends Article{

    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }
}
