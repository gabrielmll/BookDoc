/**
 * 
 */
package Sistema;

/**
 *
 *
 */
public class Exame {
	private Agenda agenda;
	private Cliente cliente;

	public Exame(Cliente cliente) {
		this.cliente = cliente;
	}

	public String toString() {
		return "Cliente " + cliente.toString() + " realiza exame na data ";
	}
}