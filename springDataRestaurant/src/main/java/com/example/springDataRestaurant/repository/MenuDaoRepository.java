package com.example.springDataRestaurant.repository;

import com.example.springDataRestaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDaoRepository extends JpaRepository<Menu, Long> {
}
