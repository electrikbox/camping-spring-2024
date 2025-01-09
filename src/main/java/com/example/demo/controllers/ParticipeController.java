package com.example.demo.controllers;

import com.example.demo.models.Participe;
import com.example.demo.models.ParticipeId;
import com.example.demo.services.ParticipateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Participes")
public class ParticipeController {

    @Autowired
    private ParticipateService ParticipeService;

    @GetMapping
    public List<Participe> getParticipes() {
        return ParticipeService.getAllParticipes();
    }

    @GetMapping("/{id}")
    public Participe getParticipeById(@PathVariable("id") ParticipeId id) {
        return ParticipeService.getParticipeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipe(@PathVariable("id") ParticipeId id) {
        ParticipeService.deleteParticipe(id);
    }

    @PostMapping()
    public Participe saveParticipe(@RequestBody Participe Participe) {
        return ParticipeService.saveParticipe(Participe);
    }

    @PatchMapping()
    public Participe updateParticipe(@RequestBody Participe Participe) {
        return ParticipeService.saveParticipe(Participe);
    }
}
