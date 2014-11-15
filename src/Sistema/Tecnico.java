/**
 * Técnico é uma pessoa que realiza exames.
 */
package Sistema;

/**
 *
 *
 */
public class Tecnico extends Pessoa{
	int id;
	private String especialidade;

	public Tecnico(int id, String nome, String especialidade) {
		super(nome);
		this.id = id;
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

}
