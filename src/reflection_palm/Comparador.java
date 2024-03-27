/**
 * 
 */
package reflection_palm;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:54 - 27/03/2024
 *
 */
public class Comparador {

	/**
	 * 
	 * Método que debe obtener los atributos que no son iguales
	 * en los objetos pasados como parámetro.
	 * 
	 * @param <T>
	 * @param <K>
	 * @param userA
	 * @param userB
	 * @return Diccionario que contiene el nombre del atributo (key) y su valor <value>
	 */
	public <T,K> Map<String, Valores> comparar(T userA, K userB) {
		// TODO Auto-generated method stub
		Map<String, Valores> diferencias = new HashMap<>();
		
		// Borrar
		diferencias.put("test", new Valores("test1", "test2"));
		diferencias.put("test2", new Valores(10, 42));
		// Borrar
		
		
		return diferencias;
	}

}
