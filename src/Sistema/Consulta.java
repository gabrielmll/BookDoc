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
	private int data;
	private int tipo;
	
	public static int CORTESIA = 1;
	public static int PARTICULAR = 2;
	public static int CONVENIO = 3;

	public Consulta(Medico medico, Cliente cliente, int data, int tipo) {
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

	public int getData() {
		return data;
	}

	public void setData(int data) {
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