package fr.bouget.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bouget.jpa.model.Barrique;

@Repository
public interface BarriqueRepository extends JpaRepository<Barrique, Integer> {

}
