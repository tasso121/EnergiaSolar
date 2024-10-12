package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestCliente.class, TestEquipamento.class, TestFabricante.class, TestInversor.class,
		TestOrcamento.class, TestPlacaSolar.class, TestProjeto.class })
public class AllTests {

}
