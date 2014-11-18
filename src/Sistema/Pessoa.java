/**
 * Pessoa é uma classe que engloba as entidades Médico, Cliente, Técnico e Funcionário. 
 */
package Sistema;

/**
 *
 *
 */
public class Pessoa {
	private String nome;
	private String identidade;
	private String cpf;
	private String endereco;
	private String telefone;
	private String nascimento;

	public Pessoa(String nome, String identidade, String cpf, String endereco,
			String telefone, String nascimento) {
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public int getId() {
		return -1;
	}

	public String toString() {
		return nome;
	}
}