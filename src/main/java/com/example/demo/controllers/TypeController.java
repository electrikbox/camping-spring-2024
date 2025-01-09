package com.example.demo.controllers;

import com.example.demo.models.Type;
import com.example.demo.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping
    public List<Type> getTypes() {
        return typeService.getAllTypes();
    }

    @GetMapping("/{id}")
    public Type getTypeById(@PathVariable("id") int id) {
        return typeService.getTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteType(@PathVariable("id") int id) {
        typeService.deleteType(id);
    }

    @PostMapping()
    public Type saveType(@RequestBody Type type) {
        return typeService.saveType(type);
    }

    @PatchMapping()
    public Type updateType(@RequestBody Type type) {
        return typeService.saveType(type);
    }
}
