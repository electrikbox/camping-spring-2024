package com.example.demo.controllers;

import com.example.demo.models.Service;
import com.example.demo.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getClients() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public Service getClientById(@PathVariable("id") int id) {
        return serviceService.getServiceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        serviceService.deleteService(id);
    }

    @PostMapping()
    public Service saveClient(@RequestBody Service service) {
        return serviceService.saveService(service);
    }

    @PatchMapping()
    public Service updateClient(@RequestBody Service service) {
        return serviceService.saveService(service);
    }
}
