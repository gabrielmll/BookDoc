/**
 * Cliente é uma pessoa que receberá os serviços do hospital. 
 */
package Sistema;

import java.util.ArrayList;

/**
 *
 *
 */
public class Cliente extends Pessoa {
	private int id;
	private ArrayList<Exame> exames = new ArrayList<Exame>();
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();

	public Cliente(int id, String nome, String identidade, String cpf,
			String endereco, String telefone, String nascimento) {
		super(nome, identidade, cpf, endereco, telefone, nascimento);
		this.id = id;
	}

	public Cliente(int id, Pessoa p) {
		super(p.getNome(), p.getIdentidade(), p.getCpf(), p.getEndereco(), p
				.getTelefone(), p.getNascimento());
		this.id = id;

	}

	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
