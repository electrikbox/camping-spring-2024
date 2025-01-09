package com.example.demo.services;

import com.example.demo.models.FacturesService;
import com.example.demo.repository.FacturesServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceService {

    @Autowired
    private FacturesServiceRepository facturesServiceRepository;

    public List<FacturesService> getAllFacturesServices() {
        return facturesServiceRepository.findAll();
    }

    public FacturesService getFacturesServiceById(int id) {
        return facturesServiceRepository.findById(id).get();
    }

    public FacturesService saveFacturesService(FacturesService FacturesService) {
        return facturesServiceRepository.save(FacturesService);
    }

    public void deleteFacturesService(int id) {
        facturesServiceRepository.deleteById(id);
    }
}
