package br.henrique.webservice;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/carros")
public class CarrosController {
    @Autowired
    private CarrosManager carrosManager;
    
    @GetMapping
    public List<Carro> findAll(){
        List<Carro> listCarros = carrosManager.getCarros();
        return listCarros;
    }
} 