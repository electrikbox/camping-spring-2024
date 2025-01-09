package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hebergements")
public class Hebergement {
    @Id
    @Column(name = "id_hebergement", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "emplacement", length = 50)
    private String emplacement;

    @Column(name = "etat")
    private String etat;

    @Column(name = "id_type", nullable = false)
    private Integer idType;

}