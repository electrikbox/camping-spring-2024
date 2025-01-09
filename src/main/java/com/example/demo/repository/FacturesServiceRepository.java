package com.example.demo.repository;

import com.example.demo.models.FacturesService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturesServiceRepository extends JpaRepository<FacturesService, Integer> {
}