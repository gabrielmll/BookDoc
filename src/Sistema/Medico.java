/**
 * Medico é uma pessoa que realiza consultas dependendo de sua especialidade e disponibilidade de agenda.
 */
package Sistema;

/**
 *
 *
 */
public class Medico extends Pessoa {
	private String especialidade;

	public Medico(int id, String nome, String especialidade) {
		super(id, nome);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}
}