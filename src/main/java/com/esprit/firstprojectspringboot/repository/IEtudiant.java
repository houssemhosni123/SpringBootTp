package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Etudiant;
import com.esprit.firstprojectspringboot.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IEtudiant extends JpaRepository<Etudiant,Long> {


    List<Etudiant> findByReservations(Reservation reservation);


    List<Etudiant> findByDateNaissance(Date date);


    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByNomEtAndPrenomEt(String nom, String prenom);


}
