/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version  22:09:33 - 27/03/2024
 *
 */
package reflection_palm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TestComparador {
	
	private Comparador comparador;
	private UserA userA;
	private UserB userB;
	private Map<String, Valores> diferencias;

	@BeforeEach
	public void setUp() {
		comparador = new Comparador();

		userA = new UserA();
		userA.setId(UUID.randomUUID().toString());
		userA.setNombre("Pepe");
		userA.setEdad(42);
		userA.setDireccion("Calle real 103");
		userA.setApellido("Rodriguez");

		userB = new UserB();
		userB.setId(UUID.randomUUID().toString());
		userB.setNombre("Pepe");
		userB.setProvincia("Córdoba");
		userB.setEdad(42);
		userB.setDireccion("Calle falsa 23");
		userB.setApellido("Manuel");
		userB.setTelefono("777543212");

		diferencias = comparador.comparar(userA, userB);
	}

	@Test
	public void testTamañoDelMapaDeDiferencias() {
		assertEquals(5, diferencias.size());
	}

	@Test
	public void testContieneId() {
		assertTrue(diferencias.containsKey("id"));
	}

	@Test
	public void testContieneProvincia() {
		assertTrue(diferencias.containsKey("provincia"));
	}

	@Test
	public void testContieneDireccion() {
		assertTrue(diferencias.containsKey("direccion"));
	}

	@Test
	public void testContieneApellido() {
		assertTrue(diferencias.containsKey("apellido"));
	}

	@Test
	public void testContieneTelefono() {
		assertTrue(diferencias.containsKey("telefono"));
	}
}
