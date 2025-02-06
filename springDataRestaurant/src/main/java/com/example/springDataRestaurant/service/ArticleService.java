package com.example.springDataRestaurant.service;

import com.example.springDataRestaurant.model.Article;
import com.example.springDataRestaurant.repository.ArticleDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    ArticleDaoRepository articleDao;

    // scrivo i metodi per interagire con il database
    public void saveArticle(Article article){
        articleDao.save(article);
    }
}
