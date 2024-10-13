package com.mycompany.EnergiaSolar.src.main.java.poo.example;

public class PlacaSolar extends Equipamento {
    private float capacidade;

    public PlacaSolar(String modelo, float preco, Fabricante fabricante, float capacidade) {
        super(modelo, preco, fabricante);
        this.capacidade = capacidade;
    }
    
    public float getCapacidade()
    {
    	return this.capacidade;
    }
    
    @Override
    public String obterInformacoes()
    {
    	String modelo = this.getModelo() + ';';
    	String preco = String.valueOf(this.getPreco()) + ';';
    	String fabricante = this.getFabricante().getNome() + ';';
    	String capacidade = String.valueOf(this.getCapacidade());
    	
    	return modelo + preco + fabricante + capacidade;
    }
}
