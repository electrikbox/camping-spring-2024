package com.example.demo.controllers;

import com.example.demo.models.FacturesService;
import com.example.demo.services.FactureServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FacturesService")
public class FactureServiceController {

    @Autowired
    private FactureServiceService FactureServiceService;

    @Autowired

    @GetMapping
    public List<FacturesService> getFactures() {
        return FactureServiceService.getAllFacturesServices();
    }

    @GetMapping("/{id}")
    public FacturesService getFactureById(@PathVariable("id") int id) {
        return FactureServiceService.getFacturesServiceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable("id") int id) {
        FactureServiceService.deleteFacturesService(id);
    }

    @PostMapping()
    public FacturesService saveFacture(@RequestBody FacturesService Facture) {
        return FactureServiceService.saveFacturesService(Facture);
    }

    @PatchMapping()
    public FacturesService updateFacture(@RequestBody FacturesService Facture) {
        return FactureServiceService.saveFacturesService(Facture);
    }
}
