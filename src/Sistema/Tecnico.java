/**
 * Técnico é uma pessoa que realiza exames.
 */
package Sistema;

/**
 *
 *
 */
public class Tecnico extends Pessoa {
	int id;
	private String especialidade;

	public Tecnico(int id, String especialidade, String nome,
			String identidade, String cpf, String endereco, String telefone,
			String nascimento) {
		super(nome, identidade, cpf, endereco, telefone, nascimento);
		this.id = id;
		this.especialidade = especialidade;
	}

	public Tecnico(int id, Pessoa p, String especialidade) {
		super(p.getNome(), p.getIdentidade(), p.getCpf(), p.getEndereco(), p
				.getTelefone(), p.getNascimento());
		this.id = id;
		this.especialidade = especialidade;
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
