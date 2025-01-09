package com.example.demo.services;

import com.example.demo.models.Echeance;
import com.example.demo.repository.EcheanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcheanceService {

    @Autowired
    private EcheanceRepository echeanceRepository;

    public List<Echeance> getAllEcheances() {
        return echeanceRepository.findAll();
    }

    public Echeance getEcheanceById(int id) {
        return echeanceRepository.findById(id).get();
    }

    public Echeance saveEcheance(Echeance Echeance) {
        return echeanceRepository.save(Echeance);
    }

    public void deleteEcheance(int id) {
        echeanceRepository.deleteById(id);
    }
}
