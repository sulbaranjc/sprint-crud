package com.sulbaranjc.api.springcrud.web;

import com.sulbaranjc.api.springcrud.entities.Auto;
import com.sulbaranjc.api.springcrud.service.IAutoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/api/v1")
public class AutoResource {
    @Autowired
    private IAutoservice autoService;

    @PostMapping("/autos")
    public ResponseEntity<Auto> crearAuto(@RequestBody Auto auto){
        return new ResponseEntity<>(this.autoService.crear(auto), HttpStatus.CREATED);
    }


}