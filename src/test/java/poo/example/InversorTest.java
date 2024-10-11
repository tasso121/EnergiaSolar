package com.mycompany.EnergiaSolar.src.test.java.poo.example;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InversorTest {
    private Inversor inversor;

    @BeforeEach
    void inversorObjetoTest() {
        Fabricante fabricante = new Fabricante("SolarMax");
        inversor = new Inversor("electro",300f, fabricante, 100f);
    }

    @Test
    void getPotencia() {
        assertEquals(100f,inversor.getPotencia());
    }

    @Test
    void obterInformacoes() {
        assertEquals("electro;300.0;SolarMax;100.0",inversor.obterInformacoes());
    }
}