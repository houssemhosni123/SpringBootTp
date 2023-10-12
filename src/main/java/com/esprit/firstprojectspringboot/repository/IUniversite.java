package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUniversite  extends JpaRepository<Universite,Long> {


    List<Universite> findByAdresse(String adresse);
    Universite findByNomUniversite(String nomUniversite);
    Universite findByIdUniversite(long id);


    long count();

}
