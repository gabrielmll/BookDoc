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

	public Funcionario(int id, String cargo, String nome, String identidade,
			String cpf, String endereco, String telefone, String nascimento) {
		super(nome, identidade, cpf, endereco, telefone, nascimento);
		this.id = id;
		this.cargo = cargo;
	}

	public Funcionario(int id, Pessoa p, String cargo) {
		super(p.getNome(), p.getIdentidade(), p.getCpf(), p.getEndereco(), p
				.getTelefone(), p.getNascimento());
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