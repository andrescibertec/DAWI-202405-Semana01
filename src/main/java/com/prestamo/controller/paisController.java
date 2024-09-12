package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pais;
import com.prestamo.service.paisService;

@RestController
@RequestMapping("/url/pais")
public class paisController {

	@Autowired
    private paisService paisService;


    @GetMapping("/lista")
    public List<Pais> getAllPaises() {
        return paisService.findAll();
    }
}