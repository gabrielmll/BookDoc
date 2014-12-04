/**
 * Consulta � um tipo de servi�o no qual um cliente se vincula � uma especialidade, um m�dico e um hor�rio. 
 */
package Sistema;

/**
 *
 *
 */
public class Consulta {
	private Medico medico;
	private Cliente cliente;
	private String data;
	private int tipo;

	public Consulta(Medico medico, Cliente cliente, String data, int tipo) {
		this.medico = medico;
		this.cliente = cliente;
		this. data = data;
		this.tipo = tipo;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Medico " + medico.toString() + " consulta " + cliente.toString() + " na data ";
	}
}