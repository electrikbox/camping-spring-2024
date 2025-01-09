package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "services")
public class Service {
    @Id
    @Column(name = "id_services", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "prix", precision = 15, scale = 2)
    private BigDecimal prix;

}