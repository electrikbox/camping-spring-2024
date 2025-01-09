package com.example.demo.repository;

import com.example.demo.models.Participe;
import com.example.demo.models.ParticipeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipeRepository extends JpaRepository<Participe, ParticipeId> {
}