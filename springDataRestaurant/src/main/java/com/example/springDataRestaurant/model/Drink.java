package com.example.springDataRestaurant.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Drink extends Article{

    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }
}
