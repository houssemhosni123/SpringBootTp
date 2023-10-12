package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBloc extends JpaRepository<Bloc,Long> {

    List<Bloc> findAllByCapaciteBlocGreaterThan(long capacite);



    List<Bloc> findAllByChambresIsEmpty();
    Bloc findByIdBloc(long id);
    List<Bloc> findAllByNomBloc(String nomBloc);









}
