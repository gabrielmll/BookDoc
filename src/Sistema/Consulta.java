/**
 * Consulta é um tipo de serviço no qual um cliente se vincula à uma especialidade, um médico e um horário. 
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