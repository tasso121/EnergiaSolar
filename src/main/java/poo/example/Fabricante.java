package com.mycompany.EnergiaSolar.src.main.java.poo.example;

public class Fabricante {
    private String nome;

    public Fabricante(String nome) {
        this.nome = nome;
        AplicacaoService.adicionarFabricante(this);
    }
    
    public String getNome() {
    	return this.nome;
    }
}
