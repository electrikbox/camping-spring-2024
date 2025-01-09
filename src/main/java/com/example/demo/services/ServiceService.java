package com.example.demo.services;

import com.example.demo.models.Service;
import com.example.demo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public Service getServiceById(int id) {
        return serviceRepository.findById(id).get();
    }

    public Service saveService(Service Service) {
        return serviceRepository.save(Service);
    }

    public void deleteService(int id) {
        serviceRepository.deleteById(id);
    }
}
