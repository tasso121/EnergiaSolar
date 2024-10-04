package poo.example;

public class Projeto {
    private int id;
    private Cliente cliente;
    private Orcamento orcamento;
    private Integer qtd_paineis;

    public Projeto(int id, Cliente cliente, Orcamento orcamento, Integer qtd_paineis) {
        this.id = id;
        this.cliente = cliente;
        this.orcamento = orcamento;
        this.qtd_paineis = qtd_paineis;
    }
}
