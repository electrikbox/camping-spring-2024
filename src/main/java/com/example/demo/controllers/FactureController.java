package com.example.demo.controllers;

import com.example.demo.models.Facture;
import com.example.demo.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Factures")
public class FactureController {

    @Autowired
    private FactureService factureService;

    @GetMapping
    public List<Facture> getFactures() {
        return factureService.getAllFactures();
    }

    @GetMapping("/{id}")
    public Facture getFactureById(@PathVariable("id") int id) {
        return factureService.getFactureById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable("id") int id) {
        factureService.deleteFacture(id);
    }

    @PostMapping()
    public Facture saveFacture(@RequestBody Facture facture) {
        return factureService.saveFacture(facture);
    }

    @PatchMapping()
    public Facture updateFacture(@RequestBody Facture facture) {
        return factureService.saveFacture(facture);
    }
}
