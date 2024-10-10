package poo.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlacaSolarTest {
    private PlacaSolar placaSolar;

    @BeforeEach
    void placaSolarObjetoTest() {
        Fabricante fabricante = new Fabricante("SolarMax");
        placaSolar = new PlacaSolar("fotovoltaico",4000f, fabricante, 2000f);
    }
    @Test
    void getCapacidade() {
        assertEquals(2000f,placaSolar.getCapacidade());
    }

    @Test
    void obterInformacoes() {
        assertEquals("fotovoltaico;4000.0;SolarMax;2000.0",placaSolar.obterInformacoes());
    }
}