package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Chambre;
import com.esprit.firstprojectspringboot.entities.Etudiant;
import com.esprit.firstprojectspringboot.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambre extends JpaRepository<Chambre,Long> {


    Chambre findChambreByNumeroChambre(long numC);
    List<Chambre> findAllByNumeroChambreIsNull();

    List<Chambre> findAllByTypeC(TypeChambre type);


    long count();






}
