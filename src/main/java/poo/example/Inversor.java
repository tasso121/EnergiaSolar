package poo.example;

public class Inversor extends Equipamento{
    private float potencia;

    public Inversor(String modelo, float preco, Fabricante fabricante, float potencia) {
        super(modelo, preco, fabricante);
        this.potencia = potencia;
    }
}
