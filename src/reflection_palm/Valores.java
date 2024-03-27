/**
 * 
 */
package reflection_palm;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:54 - 27/03/2024
 *
 */
public class Valores<T> {

	private T anterior;
	private T posterior;

	public Valores(T anterior, T posterior) {
		super();
		this.anterior = anterior;
		this.posterior = posterior;
	}

	public T getAnterior() {
		return this.anterior;
	}

	public void setAnterior(T anterior) {
		this.anterior = anterior;
	}

	public T getPosterior() {
		return this.posterior;
	}

	public void setPosterior(T posterior) {
		this.posterior = posterior;
	}

	@Override
	public String toString() {
		return "Valores [anterior=" + this.anterior + ", posterior=" + this.posterior + "]";
	}
}
