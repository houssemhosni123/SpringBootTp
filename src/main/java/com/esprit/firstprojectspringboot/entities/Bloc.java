package com.esprit.firstprojectspringboot.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc implements Serializable {
    @Id
    private long idBloc;
     private String nomBloc;
     private long capaciteBloc;

    @ManyToOne
     Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set< Chambre> chambres;
}
