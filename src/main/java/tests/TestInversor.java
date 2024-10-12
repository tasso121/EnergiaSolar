package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poo.example.Fabricante;
import poo.example.Inversor;

class TestInversor {
	private Inversor inversor;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.inversor = new Inversor(
				"SX-770",
				799.90f,
				new Fabricante("Sergipe Equipamentos"),
				0.6f
		);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testObterInformacoes() {
		String informacoes = "SX-770;799.90;Sergipe Equipamentos;0.6";
		
		assertEquals(informacoes, this.inversor.obterInformacoes());
	}

	@Test
	void testInversor() {
		assertNotNull(this.inversor);
	}

	@Test
	void testGetPotencia() {
		assertEquals(0.6f, this.inversor.getPotencia());
	}

}
