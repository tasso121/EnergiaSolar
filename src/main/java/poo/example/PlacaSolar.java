package poo.example;

public class PlacaSolar extends Equipamento{
    private float capacidade;

    public PlacaSolar(String modelo, float preco, Fabricante fabricante, float capacidade) {
        super(modelo, preco, fabricante);
        this.capacidade = capacidade;
    }
}
