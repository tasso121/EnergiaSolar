package com.mycompany.EnergiaSolar.src.main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;


class TestOrcamento {
	private Orcamento orcamento;
	private Projeto projeto = new Projeto(
			new Cliente(
					"Fulano",
					"Rua dos Bobos n° 0",
					"(99) 99999-9999",
					"senha123"
			),
			70f
	);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.orcamento = new Orcamento(5700.54f, this.projeto);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOrcamento() {
		assertNotNull(this.orcamento);
	}

	@Test
	void testSetAndGetStatus() {
		this.orcamento.setStatus(StatusOrcamento.REPROVADO);
		assertEquals(StatusOrcamento.REPROVADO, this.orcamento.getStatus());
	}

	@Test
	void testGetValor() {
		assertEquals(5700.54f, this.orcamento.getValor());
	}

	@Test
	void testObterInformacoes() {
		String informacao = "5700.54;PENDENTE;" + this.projeto.getId();
		
		assertEquals(informacao, this.orcamento.obterInformacoes());
	}

}
