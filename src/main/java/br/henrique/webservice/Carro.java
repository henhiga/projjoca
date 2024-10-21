package br.henrique.webservice;



public class Carro {
    private String modelo;
    private String marca;

    public Carro(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
