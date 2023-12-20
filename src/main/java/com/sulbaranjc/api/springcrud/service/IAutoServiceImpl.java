package com.sulbaranjc.api.springcrud.service;

import com.sulbaranjc.api.springcrud.entities.Auto;
import com.sulbaranjc.api.springcrud.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IAutoServiceImpl implements IAutoservice {
    @Autowired
    private AutoRepository autoRepository;


    @Override
    public Auto crear(Auto auto) {
        return this.autoRepository.save(auto);
    }

    @Override
    public Optional<Auto> obtenerPorId(Long id) {
        return this.autoRepository.findById(id);
    }

    @Override
    public Auto actualizar(Long id, double nuevoPrecio) {
        return null;
    }

    @Override
    public boolean eliminar(Long id) {
        return false;
    }
}
