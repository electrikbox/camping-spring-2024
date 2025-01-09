package com.example.demo.controllers;

import com.example.demo.models.Echeance;
import com.example.demo.services.EcheanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/echeances")
public class EcheanceController {

    @Autowired
    private EcheanceService echeanceService;

    @GetMapping
    public List<Echeance> getEcheances() {
        return echeanceService.getAllEcheances();
    }

    @GetMapping("/{id}")
    public Echeance getEcheanceById(@PathVariable("id") int id) {
        return echeanceService.getEcheanceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEcheance(@PathVariable("id") int id) {
        echeanceService.deleteEcheance(id);
    }

    @PostMapping()
    public Echeance saveEcheance(@RequestBody Echeance Echeance) {
        return echeanceService.saveEcheance(Echeance);
    }

    @PatchMapping()
    public Echeance updateEcheance(@RequestBody Echeance Echeance) {
        return echeanceService.saveEcheance(Echeance);
    }
}
