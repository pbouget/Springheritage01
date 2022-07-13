package fr.bouget.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bouget.jpa.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
