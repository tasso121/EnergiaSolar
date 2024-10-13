package com.mycompany.EnergiaSolar.src.main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;

class TestCliente {
	private Cliente cliente;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.cliente = new Cliente(
				"Fulano",
				"Rua dos Bobos n° 0",
				"(99) 99999-9999",
				"senha123"
		);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCliente() {
		assertNotNull(this.cliente);
	}

	@Test
	void testSolicitarProjeto() {
		int qtdNotificacoes = AplicacaoService.getNotificacoes().size();
		
		this.cliente.solicitarProjeto(56);
		
		assertEquals(qtdNotificacoes + 1, AplicacaoService.getNotificacoes().size());
		AplicacaoService.getNotificacoes().remove(qtdNotificacoes-1);
		
		
		assertEquals(1, this.cliente.obterProjetos().size());
	}

	@Test
	void testObterOrcamentos() {
		assertEquals(0, this.cliente.obterOrcamentos().size());
	}

	@Test
	void testAdicionarEObterNotificacao() {
		this.cliente.adicionarNotificacao("mensagem de teste");
		
		assertEquals(1, this.cliente.getNotificacoes().size());
	}

	@Test
	void testGetNome() {
		assertEquals("Fulano", this.cliente.getNome());
	}

	@Test
	void testGetTelefone() {
		assertEquals("(99) 99999-9999", this.cliente.getTelefone());
	}

	@Test
	void testGetSenha() {
		assertEquals("senha123", this.cliente.getSenha());
	}

	@Test
	void testGetEndereco() {
		assertEquals("Rua dos Bobos n° 0", this.cliente.getEndereco());
	}

	@Test
	void testAdicionarEObterProjeto() {
		this.cliente.adicionarProjeto(null);
		
		assertEquals(1, this.cliente.obterProjetos().size());
	}

	@Test
	void testObterInformacoes() {
		String informacao = "Fulano;Rua dos Bobos n° 0;(99) 99999-9999;senha123";
		
		assertEquals(informacao, this.cliente.obterInformacoes());
	}
}
