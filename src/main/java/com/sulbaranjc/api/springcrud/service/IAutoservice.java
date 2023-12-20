package com.sulbaranjc.api.springcrud.service;


import com.sulbaranjc.api.springcrud.entities.Auto;

import java.util.Optional;

public interface IAutoservice {
    Auto crear(Auto auto);
    Optional<Auto> obtenerPorId(Long id);
    Auto actualizar(Long id, double nuevoPrecio);
    boolean eliminar(Long id);


}
