package poo.example;

import java.util.List;

public class AplicacaoService {
    private List<Cliente> clientes;
    private List<String> notificacoes;
    private float margemLucro;
    private float custoMaoDeObra;
    private String senha;

    public void cadastrarCliente(String nome, String endereco, String telefone, String senha){

    }

    public void cadastrarFabricante(String nome){

    }

    public void cadastrarPlacaSolar(String modelo, float preco, Fabricante fabricante, float capacidade){

    }

    public void cadastrarInversor(String modelo, float preco, Fabricante fabricante, float potencia){

    }

//    public int calcularNumeroPaineis(){}
//    public int calcularNumeroInversores(){}
//    public float calcularOrcamento(){}
//    public void enviarOrcamento(){}
//    private void notificarCliente(){}
//    public void adcionarNotficacao(){}
//    public String obterInformacoes(){}


    public List<String> getNotificacoes() {
        return notificacoes;
    }

    public String getSenha() {
        return senha;
    }
}
