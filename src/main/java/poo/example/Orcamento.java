package com.mycompany.EnergiaSolar.src.main.java.poo.example;

public class Orcamento {
    private float valor;
    private StatusOrcamento status;
    private Projeto projeto;

    public Orcamento(float valor, Projeto projeto) {
        this.valor = valor;
        this.status = StatusOrcamento.PENDENTE;
        this.projeto = projeto;
        projeto.setOrcamento(this);
    }
    
    public void setStatus(StatusOrcamento status) {
    	this.status = status;
    }
    
    public float getValor(){
        return valor;
    }
    
    //public String obterInformacoes() {}
}
