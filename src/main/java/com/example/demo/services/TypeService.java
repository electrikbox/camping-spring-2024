package com.example.demo.services;

import com.example.demo.models.Type;
import com.example.demo.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    public Type getTypeById(int id) {
        return typeRepository.findById(id).get();
    }

    public Type saveType(Type Type) {
        return typeRepository.save(Type);
    }

    public void deleteType(int id) {
        typeRepository.deleteById(id);
    }
}
