package com.mycompany.EnergiaSolar.src.main.java.poo.example;

public abstract class Equipamento {
    private String modelo;
    private float preco;
    private Fabricante fabricante;

    public String getModelo() {
        return this.modelo;
    }

    public float getPreco() {
        return this.preco;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public Equipamento(String modelo, float preco, Fabricante fabricante) {
        this.modelo = modelo;
        this.preco = preco;
        this.fabricante = fabricante;
    }
    
    public abstract String obterInformacoes();
}
