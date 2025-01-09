package com.example.demo.controllers;

import com.example.demo.models.Hebergement;
import com.example.demo.services.HebergementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hebergements")
public class HebergementController {

    @Autowired
    private HebergementService HebergementService;

    @GetMapping
    public List<Hebergement> getHebergements() {
        return HebergementService.getAllHebergements();
    }

    @GetMapping("/{id}")
    public Hebergement getHebergementById(@PathVariable("id") int id) {
        return HebergementService.getHebergementById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteHebergement(@PathVariable("id") int id) {
        HebergementService.deleteHebergement(id);
    }

    @PostMapping()
    public Hebergement saveHebergement(@RequestBody Hebergement Hebergement) {
        return HebergementService.saveHebergement(Hebergement);
    }

    @PatchMapping()
    public Hebergement updateHebergement(@RequestBody Hebergement Hebergement) {
        return HebergementService.saveHebergement(Hebergement);
    }
}
