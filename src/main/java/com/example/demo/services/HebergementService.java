package com.example.demo.services;

import com.example.demo.models.Hebergement;
import com.example.demo.repository.HebergementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HebergementService {

    @Autowired
    private HebergementRepository hebergementRepository;

    public List<Hebergement> getAllHebergements() {
        return hebergementRepository.findAll();
    }

    public Hebergement getHebergementById(int id) {
        return hebergementRepository.findById(id).get();
    }

    public Hebergement saveHebergement(Hebergement Hebergement) {
        return hebergementRepository.save(Hebergement);
    }

    public void deleteHebergement(int id) {
        hebergementRepository.deleteById(id);
    }
}
