package com.mycompany.EnergiaSolar.src.main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;

class TestFabricante {
	private Fabricante fabricante;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.fabricante = new Fabricante("Sergipe Equipamentos");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFabricante() {
		assertNotNull(this.fabricante);
	}

	@Test
	void testGetNome() {
		assertEquals("Sergipe Equipamentos", this.fabricante.getNome());
	}

}
