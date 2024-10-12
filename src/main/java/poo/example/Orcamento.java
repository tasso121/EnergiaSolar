package poo.example;

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
    
    public StatusOrcamento getStatus(){
        return status;
    }
    
    public float getValor(){
        return valor;
    }
    
    public String obterInformacoes() {
    	String valor = String.valueOf(this.valor) + ';';
    	String status = String.valueOf(this.status) + ';';
    	String projetoId = String.valueOf(this.projeto.getId());
    	
    	return valor + status + projetoId;
    }
}
