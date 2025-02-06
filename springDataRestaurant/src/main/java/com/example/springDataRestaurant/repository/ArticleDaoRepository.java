package com.example.springDataRestaurant.repository;

import com.example.springDataRestaurant.model.Article;
import com.example.springDataRestaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// qui dico che oggetti manipolare --> article con id di tipo long
public interface ArticleDaoRepository extends JpaRepository<Article, Long> {
}
