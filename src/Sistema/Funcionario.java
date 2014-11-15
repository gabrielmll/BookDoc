/**
 * Funcionário é uma pessoa que gerencia o setor administrativo.
 */
package Sistema;

/**
 *
 *
 */
public class Funcionario extends Pessoa {
	int id;
	private String cargo;

	public Funcionario(int id, String nome, String cargo) {
		super(nome);
		this.id = id;
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}