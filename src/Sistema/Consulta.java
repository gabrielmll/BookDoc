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
	
	Consulta(Medico medico, Cliente cliente){
		this.medico = medico;
		this.cliente = cliente;
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
}