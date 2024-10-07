package com.mycompany.EnergiaSolar.src.main.java.poo.example;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.Cliente;

public class Projeto {
    private int id;
    private Cliente cliente;
    private Orcamento orcamento;
    private PlacaSolar painel;
    private Inversor inversor;
    private Integer qtd_paineis;
    private Integer qtd_inversores;
    private static int ultimo_id = 0;
    private float consumo_medio_cliente;

    public Projeto(Cliente cliente, float consumoMedio) {
    	this.id = ++ultimo_id;
        this.cliente = cliente;
        this.orcamento = null;
        this.painel = null;
        this.inversor = null;
        this.qtd_paineis = null;
        this.qtd_inversores = null;
        this.consumo_medio_cliente = consumoMedio;
    }
    
    public int getId() {
    	return this.id;
    }
    
    public Orcamento getOrcamento() {
    	return this.orcamento;
    }
    
    public float getConsumoCliente() {
    	return this.consumo_medio_cliente;
    }
    
    public PlacaSolar getPainel() {
    	return this.painel;
    }
    
    public Inversor getInversor() {
    	return this.inversor;
    }
    
    public int getQtdPaineis() {
    	return this.qtd_paineis;
    }
    
    public int getQtdInversores() {
    	return this.qtd_inversores;
    }
    
    public void setQtdPaineis(int qtdPaineis) {
    	this.qtd_paineis = qtdPaineis;
    }
    
    public void setQtdInversores(int qtdInversores) {
    	this.qtd_inversores = qtdInversores;
    }
    
    public void setPainel(PlacaSolar painel) {
    	this.painel = painel;
    }
    
    public void setInversor(Inversor inversor) {
    	this.inversor = inversor;
    }
    
    public void setOrcamento(Orcamento orcamento) {
    	this.orcamento = orcamento;
    }
    
    //public String obterInformacoes() {}
}
