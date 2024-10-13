package com.mycompany.EnergiaSolar.src.main.java.poo.example;

public class Inversor extends Equipamento {
    private float potencia;

    public Inversor(String modelo, float preco, Fabricante fabricante, float potencia) {
        super(modelo, preco, fabricante);
        this.potencia = potencia;
    }
    
    public float getPotencia() {
    	return this.potencia;
    }
    
    @Override
    public String obterInformacoes()
    {
    	String modelo = this.getModelo() + ';';
    	String preco = String.valueOf(this.getPreco()) + ';';
    	String fabricante = this.getFabricante().getNome() + ';';
    	String potencia = String.valueOf(this.getPotencia());
    	
    	return modelo + preco + fabricante + potencia;
    }
}
