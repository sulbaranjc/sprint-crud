package com.sulbaranjc.api.springcrud.service;


import com.sulbaranjc.api.springcrud.entities.Auto;

import java.util.Optional;

public interface IAutoservice {
    Auto save(Auto auto);
    Optional<Auto> getById(Long id);
    Auto update(Long id, double nuevoPrecio);
    boolean delete(Long id);


}
