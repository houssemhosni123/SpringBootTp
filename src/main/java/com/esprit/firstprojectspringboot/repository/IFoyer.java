package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Bloc;
import com.esprit.firstprojectspringboot.entities.Etudiant;
import com.esprit.firstprojectspringboot.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IFoyer extends JpaRepository<Foyer,Long> {




    List<Foyer> findByCapaciteFoyerGreaterThan(long capacity);

    List<Foyer> findByBlocsContaining(Bloc bloc);

    Foyer findByNomFoyer(String nomFoyer);
    long count();



}
