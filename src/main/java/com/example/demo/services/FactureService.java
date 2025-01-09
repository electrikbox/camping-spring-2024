package com.example.demo.services;

import com.example.demo.models.Facture;
import com.example.demo.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    public Facture getFactureById(int id) {
        return factureRepository.findById(id).get();
    }

    public Facture saveFacture(Facture Facture) {
        return factureRepository.save(Facture);
    }

    public void deleteFacture(int id) {
        factureRepository.deleteById(id);
    }
}
