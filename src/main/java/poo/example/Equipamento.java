package poo.example;

public abstract class Equipamento {
    private String modelo;
    private float preco;
    Fabricante fabricante;

    public String getModelo() {
        return modelo;
    }

    public float getPreco() {
        return preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Equipamento(String modelo, float preco, Fabricante fabricante) {
        this.modelo = modelo;
        this.preco = preco;
        this.fabricante = fabricante;
    }
}
