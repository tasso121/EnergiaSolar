package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poo.example.Equipamento;
import poo.example.Fabricante;
import poo.example.PlacaSolar;

class TestEquipamento {
	private Equipamento equipamento;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.equipamento = new PlacaSolar(
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
	void testGetModelo() {
		assertEquals("GT-180", this.equipamento.getModelo());
	}

	@Test
	void testGetPreco() {
		assertEquals(750.43f, this.equipamento.getPreco());
	}

	@Test
	void testGetFabricante() {
		assertEquals("Sergipe Equipamentos", this.equipamento.getFabricante().getNome());
	}

	@Test
	void testEquipamento() {
		assertNotNull(this.equipamento);
	}

}
