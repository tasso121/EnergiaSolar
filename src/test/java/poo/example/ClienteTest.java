package com.mycompany.EnergiaSolar.src.test.java.poo.example;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    void clienteObjetoTest () {
        cliente = new Cliente("Carlos","aracaju","87654321","1234");
    }

    @ParameterizedTest
    @ValueSource(floats = {10f, 20f, 30f, 40f})
    void solicitarProjeto(float consumoMedio) {
        cliente.solicitarProjeto(consumoMedio);
        Assertions.assertEquals(cliente.obterProjetos().getFirst().getConsumoCliente(), consumoMedio);
    }

    @Test
    void atualizarOrcamentos() {
    }

    @Test
    void obterOrcamentos() {
        assertNotNull(cliente.obterOrcamentos());
    }

    @Test
    void adicionarNotificacao() {
        cliente.adicionarNotificacao("Solicitação de projeto recebida do cliente: " + cliente.getNome());
        Assertions.assertEquals(cliente.getNotificacoes().getFirst(),"Solicitação de projeto recebida do cliente: " + cliente.getNome() );
    }

    @Test
    void getNotificacoes() {
        assertNotNull(cliente.getNotificacoes());
    }

    @Test
    void getNome() {
        Assertions.assertEquals("Carlos", cliente.getNome());
    }

    @Test
    void getTelefone() {
        Assertions.assertEquals("87654321", cliente.getTelefone());
    }

    @Test
    void getSenha() {
        Assertions.assertEquals("1234", cliente.getSenha());
    }

    @Test
    void getEndereco() {
        Assertions.assertEquals("aracaju", cliente.getEndereco());
    }

    @Test
    void adicionarProjeto() {
        Projeto projeto = new Projeto (cliente,10f);
        Assertions.assertEquals(cliente.obterProjetos().getFirst(), projeto);
    }

    @Test
    void obterProjetos() {
        assertNotNull(cliente.obterProjetos());
    }

    @Test
    void obterInformacoes() {
        Assertions.assertEquals(cliente.obterInformacoes(), "Carlos;aracaju;87654321;1234");
    }
}