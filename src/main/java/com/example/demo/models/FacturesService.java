package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "factures_services")
public class FacturesService {
    @Id
    @Column(name = "id_facture", nullable = false)
    private Integer id;

    @Column(name = "date_facture")
    private LocalDate dateFacture;

    @Column(name = "prix_ttc", precision = 15, scale = 2)
    private BigDecimal prixTtc;

    @Column(name = "prix_ht", precision = 15, scale = 2)
    private BigDecimal prixHt;

    @Column(name = "facture")
    private Boolean facture;

    @Column(name = "id_services", nullable = false)
    private Integer idServices;

}