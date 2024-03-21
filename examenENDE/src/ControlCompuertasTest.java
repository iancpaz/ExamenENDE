import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControlCompuertasTest {

	@Test
	void testSolicitarPermiso1() {
		assertTrue(ControlCompuertas.solicitarPermiso(80));
	}

	@Test
	void testSolicitarPermiso2() {
		assertTrue(ControlCompuertas.solicitarPermiso(30));
	}

}
