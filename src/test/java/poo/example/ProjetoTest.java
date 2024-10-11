package com.mycompany.EnergiaSolar.src.test.java.poo.example;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {
    private Projeto projeto;
    private Cliente cliente;

    @BeforeEach
    void projetoObjetoTest () {
        cliente = new Cliente("Carlos","aracaju","87654321","1234");
        projeto = new Projeto(cliente,50f);
    }

    @Test
    void getId() {
        Projeto projeto2 = new Projeto(cliente,100f);
        assertEquals(1,projeto.getId());
        assertEquals(2,projeto2.getId());
    }

    @Test
    void getOrcamento() {
        assertNull(projeto.getOrcamento());
        Orcamento orcamento = new Orcamento(35f,projeto);
        projeto.setOrcamento(orcamento);
        assertNotNull(projeto.getOrcamento());
    }

    @Test
    void getConsumoCliente() {
        Assertions.assertEquals(50f, projeto.getConsumoCliente());
    }

    @Test
    void getPainel() {
        assertNull(projeto.getPainel());
        Fabricante fabricante = new Fabricante("SolarMax");
        PlacaSolar placaSolar = new PlacaSolar("fotovoltaico",4000f, fabricante, 2000f);
        projeto.setPainel(placaSolar);
        assertNotNull(projeto.getPainel());
    }

    @Test
    void getInversor() {
        assertNull(projeto.getInversor());
        Fabricante fabricante = new Fabricante("SolarMax");
        Inversor inversor = new Inversor("electro",300f, fabricante, 100f);
        projeto.setInversor(inversor);
        assertNotNull(projeto.getInversor());
    }

    @Test
    void getQtdPaineis() {
        assertNull(projeto.getQtdPaineis());
    }

    @Test
    void getQtdInversores() {
    }

    @Test
    void setQtdPaineis() {
    }

    @Test
    void setQtdInversores() {
    }

    @Test
    void setPainel() {
    }

    @Test
    void setInversor() {
    }

    @Test
    void setOrcamento() {
    }

    @Test
    void obterInformacoes() {
    }
}