/**
 * 
 */
package reflection_palm;

import java.util.Map;
import java.util.UUID;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:54 - 27/03/2024
 *
 */
public class Main {

	public static void main(String[] args) {
		Comparador comparador = new Comparador();
		
		UserA userA = new UserA();
		UserB userB = new UserB();
		
		userA.setId(UUID.randomUUID().toString());
		userA.setNombre("Pepe");
		userA.setEdad(42);
		userA.setDireccion("Calle real 103");
		userA.setApellido("Rodriguez");
		
		
		userB.setId(UUID.randomUUID().toString());
		userB.setNombre("Pepe");
		userB.setProvincia("Córdoba");
		userB.setEdad(42);
		userB.setDireccion("Calle falsa 23");
		userB.setApellido("Rodriguez ");
		userB.setTelefono("777543212");
		
		Map<String, Valores> diferencias = comparador.comparar(userA, userB);
		imprimir(diferencias);
	}
	
	
	
	private static void imprimir(Map<String, Valores> map) {
		map.forEach((key, value) -> System.out.println(String.format("key: %s, value: %s", key, value.toString())));
	}
}
