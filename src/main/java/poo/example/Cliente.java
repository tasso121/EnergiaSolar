package poo.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private final String senha;
    private List<String> notificacoes;
    private List<Projeto> projetos;

    public Cliente(String nome, String endereco, String telefone, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
        this.notificacoes = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public void solicitarProjeto(float consumoMedio) {
    	Projeto projeto = new Projeto(this, consumoMedio);
    	this.notificarEmpresa();
    }

    private void notificarEmpresa() {
    	String mensagem = "Solicitação de projeto recebida do cliente: " + this.nome;
    	AplicacaoService.adicionarNotificacao(mensagem);
    }

    public void atualizarOrcamentos (List<Orcamento> orcamentos, List<StatusOrcamento> statusOrcamentos) {
    	for(int i = 0; i < orcamentos.size(); i++)
    		orcamentos.get(i).setStatus(statusOrcamentos.get(i));
    }

    public List<Orcamento> obterOrcamentos() {
    	List<Orcamento> orcamentos = new ArrayList<>();
    	
    	for(Projeto projeto : this.projetos)
    		orcamentos.add(projeto.getOrcamento());
    	
    	return orcamentos;
    }
    
    public void adicionarNotificacao(String mensagem) {
    	this.notificacoes.add(mensagem);
    }
    
    public List<String> getNotificacoes() {
    	return this.notificacoes;
    }
    
    public String getSenha() {
    	return this.senha;
    }
    
    //public String obterInformacoes() {}
}
