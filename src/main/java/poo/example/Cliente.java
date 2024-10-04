package poo.example;

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
    }

    public void solicitarProjeto (float valor){

    }

    private void notificarEmpresa(){

    }

    public void gerenciarOrcamentos (List<Orcamento> orcamentos,List<StatusOrcamento> statusOrcamentos) {

    }

    //public List<Orcamento> obterOrcamentos(){}
}
