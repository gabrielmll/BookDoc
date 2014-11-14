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

	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public static void setPessoas(ArrayList<Pessoa> pessoas) {
		Listas.pessoas = pessoas;
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
}
