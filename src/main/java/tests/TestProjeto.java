package com.mycompany.EnergiaSolar.src.main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;


class TestProjeto {
	private Projeto projeto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.projeto = new Projeto(
				new Cliente(
						"Fulano",
						"Rua dos Bobos n° 0",
						"(99) 99999-9999",
						"senha123"
				),
				70f
		);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testProjeto() {
		assertNotNull(this.projeto);
	}

	@Test
	void testGetOrcamento() {
		assertNull(this.projeto.getOrcamento());
	}

	@Test
	void testGetCliente() {
		assertEquals("Fulano", this.projeto.getCliente().getNome());
	}

	@Test
	void testGetConsumoCliente() {
		assertEquals(70f, this.projeto.getConsumoCliente());
	}

	@Test
	void testGetPainel() {
		assertNull(this.projeto.getPainel());
	}

	@Test
	void testGetInversor() {
		assertNull(this.projeto.getInversor());
	}

	@Test
	void testGetQtdPaineis() {
		assertNull(this.projeto.getQtdPaineis());
	}

	@Test
	void testGetQtdInversores() {
		assertNull(this.projeto.getQtdInversores());
	}

	@Test
	void testSetQtdPaineis() {
		this.projeto.setQtdPaineis(5);
		
		assertEquals(5, this.projeto.getQtdPaineis());
	}

	@Test
	void testSetQtdInversores() {
		this.projeto.setQtdInversores(4);
		
		assertEquals(4, this.projeto.getQtdInversores());
	}

	@Test
	void testSetPainel() {
		PlacaSolar painel = new PlacaSolar(
				"GT-180",
				750.43f,
				new Fabricante("Sergipe Equipamentos"),
				0.45f
		);
		
		this.projeto.setPainel(painel);
		
		assertSame(painel, this.projeto.getPainel());
	}

	@Test
	void testSetInversor() {
		Inversor inversor = new Inversor(
				"SX-770",
				799.90f,
				new Fabricante("Sergipe Equipamentos"),
				0.6f
		);
		
		this.projeto.setInversor(inversor);
		
		assertSame(inversor, this.projeto.getInversor());
	}

	@Test
	void testSetOrcamento() {
		Orcamento orcamento = new Orcamento(5700.54f, this.projeto);
		
		this.projeto.setOrcamento(orcamento);
		
		assertSame(orcamento, this.projeto.getOrcamento());
	}

	@Test
	void testObterInformacoes() {
		String informacao = "(99) 99999-9999;null;null;null;null;70.0";
		
		assertEquals(informacao, this.projeto.obterInformacoes());
	}

}
