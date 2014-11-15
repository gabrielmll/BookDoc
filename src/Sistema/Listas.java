/**
 * A classe listas gerencia todas as listas do sistema
 */
package Sistema;

import java.util.ArrayList;

/**
 *
 *
 */
public class Listas {
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	private static ArrayList<Exame> exames = new ArrayList<Exame>();

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public static void setPessoas(ArrayList<Pessoa> pessoas) {
		Listas.pessoas = pessoas;
	}

	public static ArrayList<Cliente> getClientes() {
		ArrayList<Cliente> c = new ArrayList<Cliente>();
		for (Pessoa p : pessoas) {
			if (p instanceof Cliente) {
				c.add((Cliente) p);
			}
		}

		return c;
	}

	public static ArrayList<Medico> getMedicos() {
		ArrayList<Medico> m = new ArrayList<Medico>();
		for (Pessoa p : pessoas) {
			if (p instanceof Medico) {
				m.add((Medico) p);
			}
		}

		return m;
	}

	public Cliente getClienteById(int id) {
		ArrayList<Cliente> clientes = getClientes();

		for (Cliente c : clientes) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	public Medico getMedicoById(int id) {
		ArrayList<Medico> medicos = getMedicos();

		for (Medico m : medicos) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}

	public static ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public static void setConsultas(ArrayList<Consulta> consultas) {
		Listas.consultas = consultas;
	}

	public static ArrayList<Exame> getExames() {
		return exames;
	}

	public static void setExames(ArrayList<Exame> exames) {
		Listas.exames = exames;
	}

	public void addOject(Object obj) {
		if (obj instanceof Pessoa)
			getPessoas().add((Pessoa) obj);
		else if (obj instanceof Consulta) {
			getConsultas().add((Consulta) obj);
		} else if (obj instanceof Exame) {
			getExames().add((Exame) obj);
		}
	}

	public String toString() {
		String s = null;
		s = "Pessoas\n";
		for (Pessoa p : getPessoas()) {
			s = s + p.toString() + "\n";
		}

		return s;
	}
}
