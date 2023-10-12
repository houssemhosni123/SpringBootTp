package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Etudiant;
import com.esprit.firstprojectspringboot.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IReservation  extends JpaRepository<Reservation,Long> {


    List<Reservation> findByEstValideIsTrue();
    List<Reservation> findByEtudiantsContaining(Etudiant etudiant);

    long count();


}
