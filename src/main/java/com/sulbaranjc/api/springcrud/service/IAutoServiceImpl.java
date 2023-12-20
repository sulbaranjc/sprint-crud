package com.sulbaranjc.api.springcrud.service;

import com.sulbaranjc.api.springcrud.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface IAutoServiceImpl implements IAutoservice {
    @Autowired
    private AutoRepository autoRepository

}
