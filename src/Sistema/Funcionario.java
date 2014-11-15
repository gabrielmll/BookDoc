/**
 * Funcion�rio � uma pessoa que gerencia o setor administrativo.
 */
package Sistema;

/**
 *
 *
 */
public class Funcionario extends Pessoa{
	private String cargo;

	public Funcionario(int id, String nome, String cargo) {
		super(id, nome);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}
}