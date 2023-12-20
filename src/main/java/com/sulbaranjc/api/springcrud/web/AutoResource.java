package com.sulbaranjc.api.springcrud.web;

import com.sulbaranjc.api.springcrud.entities.Auto;
import com.sulbaranjc.api.springcrud.service.IAutoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController

@RequestMapping("/api/v1")
public class AutoResource {
    @Autowired
    private IAutoservice autoService;

    @PostMapping("/autos")
    public ResponseEntity<Auto> crearAuto(@RequestBody Auto auto){
        return new ResponseEntity<>(this.autoService.crear(auto), HttpStatus.CREATED);
    }
    @GetMapping("/autos/{id}")
    public ResponseEntity<Auto> obtenerAuto(@PathVariable("id") Long id) {
        Optional<Auto> optionalAuto = this.autoService.obtenerPorId(id);
        if (optionalAuto.isPresent()) {
            return new ResponseEntity<>(optionalAuto.get(), HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }


}