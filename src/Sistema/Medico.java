/**
 * Medico � uma pessoa que realiza consultas dependendo de sua especialidade e disponibilidade de agenda.
 */
package Sistema;

/**
 *
 *
 */
public class Medico extends Pessoa {
	int id;
	private String especialidade;
	private Agenda agendaMedico; 

	public Medico(int id, String especialidade, String nome, String identidade,
			String cpf, String endereco, String telefone, String nascimento, Agenda agendaMedico) {
		super(nome, identidade, cpf, endereco, telefone, nascimento);
		this.id = id;
		this.especialidade = especialidade;
	}

	public Medico(int id, Pessoa p, String especialidade, Agenda agendaMedico) {
		super(p.getNome(), p.getIdentidade(), p.getCpf(), p.getEndereco(), p
				.getTelefone(), p.getNascimento());
		this.id = id;
		this.especialidade = especialidade;
	}

	public Agenda getAgendaMedico() {
		return agendaMedico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}