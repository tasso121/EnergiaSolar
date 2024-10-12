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
        new Projeto(this, consumoMedio);
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
    
    public String getNome() {
    	return this.nome;
    }
    
    public String getTelefone() {
    	return this.telefone;
    }
        
    public String getSenha() {
    	return this.senha;
    }  
    
    public String getEndereco() {
    	return this.endereco;
    }
    
    public void adicionarProjeto(Projeto projeto) {
        this.projetos.add(projeto);
    }
    
    public List<Projeto> obterProjetos() {
        return this.projetos;
    }
    
    public String obterInformacoes() {
    	String nome = this.nome + ';';
    	String endereco = this.endereco + ';';
    	String telefone = this.telefone + ';';
    	String senha = this.senha + ';';
    	
    	String informacao = nome + endereco + telefone + senha;
    	
    	for(String notificacao : this.notificacoes) {
    		informacao += notificacao + ';';
    	}
    	
    	informacao = informacao.substring(0, informacao.length() - 1);
    	
    	return informacao;
    }
}
