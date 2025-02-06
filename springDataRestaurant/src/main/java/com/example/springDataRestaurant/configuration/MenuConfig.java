package com.example.springDataRestaurant.configuration;

import com.example.springDataRestaurant.model.Drink;
import com.example.springDataRestaurant.model.Menu;
import com.example.springDataRestaurant.model.Pizza;
import com.example.springDataRestaurant.model.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")

public class MenuConfig {

    // topping
    @Bean(name = "salami")
    public Topping salamiBean(){
        return new Topping("salami", 80, 0.99);
    }

    // pizza
    @Bean(name = "pizza margherita")
    public Pizza pizzaMargheritaBean(){
        return new Pizza("pizza margherita", 120, 4.99);
    }

    @Bean(name = "pizza salami")
    public Pizza pizzaSalamiBean(){
        Pizza p = new Pizza("pizza salami", 240, 6.49);
        p.addTopping(salamiBean());
        return p;
    }

    // drink
    @Bean(name = "water")
    public Drink waterBean(){
        return new Drink("water", 0, 1.2);
    }

    @Bean(name = "lemonade")
    public Drink lemonadeBean(){
        return new Drink("lemonade", 70, 2.5);
    }

    // menu
    @Bean(name = "menu")
    public Menu menuBean(){
        Menu m = new Menu();
        m.addToMenu(pizzaMargheritaBean());
        m.addToMenu(pizzaSalamiBean());
        m.addToMenu(waterBean());
        m.addToMenu(lemonadeBean());
        return m;
    }

}
