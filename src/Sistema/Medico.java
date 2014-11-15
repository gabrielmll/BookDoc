/**
 * Medico é uma pessoa que realiza consultas dependendo de sua especialidade e disponibilidade de agenda.
 */
package Sistema;

/**
 *
 *
 */
public class Medico extends Pessoa {
	int id;
	private String especialidade;

	public Medico(int id, String nome, String especialidade) {
		super(nome);
		this.id = id;
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}
}