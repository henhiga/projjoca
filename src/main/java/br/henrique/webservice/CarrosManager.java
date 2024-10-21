package br.henrique.webservice;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class CarrosManager {
    private List<Carro> carros;
    
    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Seila", "top"));
        this.carros.add(new Carro("seilaaa", "outro carro"));
    }

    public List<Carro> getCarros(){
        return this.carros;
    }

}
