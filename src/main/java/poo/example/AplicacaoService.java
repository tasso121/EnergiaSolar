package com.mycompany.EnergiaSolar.src.main.java.poo.example;

import java.util.ArrayList;
import java.util.List;

public abstract class AplicacaoService {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<String> notificacoes = new ArrayList<>();
    private static List<Fabricante> fabricantes = new ArrayList<>();
    private static List<Equipamento> equipamentos = new ArrayList<>();
    private static final float margemLucro = 0.3f;
    private static final float custoMaoDeObra = 1200;
    private static final String senha = "3n3rg1@So7a@r";

    public static Cliente cadastrarCliente(String nome, String endereco, String telefone, String senha) {
    	Cliente cliente = new Cliente(nome, endereco, telefone, senha);
    	clientes.add(cliente);
    	return cliente;
    }

    public static void cadastrarFabricante(String nome){
    	fabricantes.add(new Fabricante(nome));
    }

    public static void cadastrarPlacaSolar(String modelo, float preco, Fabricante fabricante, float capacidade) {
    	equipamentos.add(new PlacaSolar(modelo, preco, fabricante, capacidade));
    }

    public static void cadastrarInversor(String modelo, float preco, Fabricante fabricante, float potencia) {
    	equipamentos.add(new Inversor(modelo, preco, fabricante, potencia));
    }

    public static int calcularNumeroPaineis(Projeto projeto, PlacaSolar placa, int incidenciaSolar) {
    	int numeroPaineis = (int)Math.ceil(projeto.getConsumoCliente() / (incidenciaSolar * placa.getCapacidade() * 30));
    	projeto.setPainel(placa);
    	projeto.setQtdPaineis(numeroPaineis);
    	
    	return numeroPaineis;
    }
    
    public static int calcularNumeroInversores(Projeto projeto, Inversor inversor) {
    	int numeroInversores = (int)Math.ceil((projeto.getQtdPaineis() * projeto.getPainel().getCapacidade()) / inversor.getPotencia());
    	projeto.setInversor(inversor);
    	projeto.setQtdInversores(numeroInversores);
    	
    	return numeroInversores;
    }
    
    public static float calcularOrcamento(float custoPlacas, float custoInversores) {
    	float orcamento = custoPlacas + custoInversores + custoMaoDeObra;
    	orcamento += orcamento * margemLucro;
    	
    	return orcamento;
    }
    
    public static Orcamento enviarOrcamento(Cliente cliente, Projeto projeto, float valorOrcamento) {
    	Orcamento orcamento = new Orcamento(valorOrcamento, projeto);
    	notificarCliente(cliente, projeto);
    	return orcamento;
    }
    
    private static void notificarCliente(Cliente cliente, Projeto projeto) {
    	String mensagem = "Novo orçamento lançado referente ao projeto de id #" + projeto.getId();
    	
    	cliente.adicionarNotificacao(mensagem);
    }
    
    public static void adicionarNotificacao(String notificacao) {
    	notificacoes.add(notificacao);
    }

    public static List<String> getNotificacoes() {
        return notificacoes;
    }

    public static String getSenha() {
        return senha;
    }
    
    public static void adicionarEquipamento(Equipamento equipamento) {
    	equipamentos.add(equipamento);
    }
    
    public static Cliente obterCliente(String telefone) {
    	for(Cliente cliente : clientes) {
    		if(cliente.getTelefone().equalsIgnoreCase(telefone))
                    return cliente;
    	}
    	
    	return null;
    }
    
    public static Fabricante obterFabricante(String nome) {
    	for(Fabricante fabricante : fabricantes) {
    		if(fabricante.getNome().equalsIgnoreCase(nome))
    			return fabricante;
    	}
    	
    	return null;
    }
    
    public static Equipamento obterEquipamento(String modelo) {
    	for(Equipamento equipamento : equipamentos) {
    		if(equipamento.getModelo().equalsIgnoreCase(modelo))
    			return equipamento;
    	}
    	
    	return null;
    }
    
    public static Projeto obterProjeto(int id) {
    	for(Projeto projeto : getProjetos()) {
    		if(projeto.getId() == id)
    			return projeto;
    	}
    	
    	return null;
    }
    
    public static List<Projeto> getProjetos() {
    	List<Projeto> projetos = new ArrayList<>();
    	
    	for(Cliente cliente: clientes) {
    		for(Projeto projeto : cliente.obterProjetos()) {
    			projetos.add(projeto);
    		}
    	}
    	
    	return projetos;
    }
    
    public static List<Orcamento> getOrcamentos() {
    	List<Orcamento> orcamentos = new ArrayList<>();
    	
    	for(Projeto projeto: getProjetos()) {
    		orcamentos.add(projeto.getOrcamento());
    	}
    	
    	return orcamentos;
    }
    
    public static List<Cliente> getClientes() {
    	return clientes;
    }
    
    public static List<Equipamento> getEquipamentos() {
    	return equipamentos;
    }
    
    public static List<Fabricante> getFabricantes() {
    	return fabricantes;
    }
}
