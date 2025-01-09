package com.example.demo.services;

import com.example.demo.models.Participe;
import com.example.demo.models.ParticipeId;
import com.example.demo.repository.ParticipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticiperService {

    @Autowired
    private ParticipeRepository participeRepository;

    public List<Participe> getAllParticipes() {
        return participeRepository.findAll();
    }

    public Participe getParticipeById(ParticipeId id) {
        return participeRepository.findById(id).get();
    }

    public Participe saveParticipe(Participe Participe) {
        return participeRepository.save(Participe);
    }

    public void deleteParticipe(ParticipeId id) {
        participeRepository.deleteById(id);
    }
}
