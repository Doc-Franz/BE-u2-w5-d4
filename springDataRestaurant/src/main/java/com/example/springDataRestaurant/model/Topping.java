package com.example.springDataRestaurant.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Topping extends Article{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}
