package com.mycompany.EnergiaSolar.src.main.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;


class TestPlacaSolar {
	private PlacaSolar placa;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.placa = new PlacaSolar(
				"GT-180",
				750.43f,
				new Fabricante("Sergipe Equipamentos"),
				0.45f
		);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testObterInformacoes() {
		String informacoes = "GT-180;750.43;Sergipe Equipamentos;0.45";
		
		assertEquals(informacoes, this.placa.obterInformacoes());
	}

	@Test
	void testPlacaSolar() {
		assertNotNull(this.placa);
	}

	@Test
	void testGetCapacidade() {
		assertEquals(0.45f, this.placa.getCapacidade());
	}

}
