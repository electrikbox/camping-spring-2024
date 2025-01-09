package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hebergements")
public class Hebergement {
    @Id
    @Column(name = "id_hebergement", nullable = false)
    private Integer id;

    @Column(name = "emplacement", length = 50)
    private String emplacement;

    @Column(name = "etat")
    private String etat;

    @Column(name = "id_type", nullable = false)
    private Integer idType;

}