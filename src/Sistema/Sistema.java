/**
 * Classe que centraliza o funcionamento do sistema
 */
package Sistema;

/**
 * 
 *
 */
public class Sistema {
	private Clinica clinica;
	private Listas listas; // listas contem Pessoas, Exames e Consultas

	public Sistema(String nomeClinica) {
		setClinica(new Clinica(nomeClinica));
	}

	public Listas getListas() {
		return listas;
	}

	public void setListas(Listas listas) {
		this.listas = listas;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public void addPessoa(Pessoa p) {
		listas.addOject(p);
	}

	public void addExame(Exame e) {
		listas.addOject(e);
	}

	public void addConsulta(Consulta c) {
		listas.addOject(c);
	}
}