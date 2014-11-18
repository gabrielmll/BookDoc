/**
 * 
 */
package Sistema;

/**
 *
 *
 */
public class Exame {
	private String nome;
	private Cliente cliente;
	private int data;
	private int tipo;
	
	private static Agenda agenda;
	
	public Exame(String nome, Cliente cliente, int data, int tipo) {
		this.nome = nome;
		this.cliente = cliente;
		this.data = data;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public static Agenda getAgenda() {
		return agenda;
	}

	public static void setAgenda(Agenda agenda) {
		Exame.agenda = agenda;
	}

	public String toString() {
		return "Cliente " + cliente.toString() + " realiza exame na data ";
	}
}