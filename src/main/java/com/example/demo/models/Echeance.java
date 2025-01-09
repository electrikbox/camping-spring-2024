package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "echeances")
public class Echeance {
    @Id
    @Column(name = "id_echeance", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_echeance")
    private LocalDate dateEcheance;

    @Column(name = "montant", precision = 15, scale = 2)
    private BigDecimal montant;

    @Column(name = "payer")
    private Boolean payer;

    @Column(name = "id_facture", nullable = false)
    private Integer idFacture;

}