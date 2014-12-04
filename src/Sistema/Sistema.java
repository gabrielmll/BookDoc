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
	private static Listas listas; // listas contem Pessoas, Exames e Consultas

	public Sistema(String nomeClinica) {
		setClinica(new Clinica(nomeClinica));
		listas = new Listas();
	}

	public static Listas getListas() {
		return listas;
	}

	@SuppressWarnings("static-access")
	public void setListas(Listas listas) {
		this.listas = listas;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public static void addPessoa(Pessoa p) {
		listas.addOject(p);
	}

	public void addExame(Exame e) {
		listas.addOject(e);
	}

	public void addConsulta(Consulta c) {
		listas.addOject(c);
	}

	/**
	 * Validação de login
	 * 
	 * @param id
	 *            - Identificador de Cliente para conferência
	 * @param senha
	 *            - Senha (não seguro)
	 * @return - (0 - login com sucesso) || (-1 - senha incorreta) || (1 -
	 *         usuário inexistente)
	 */
	public static int validaLogin(String id, String senha) {

		Cliente c = listas.getClienteById(Integer.parseInt(id));

		if (c != null) {
			if (c.getSenha().equals(senha)) {
				return 0; // logado com sucesso
			} else {
				return -1; // senha incorreta
			}
		}

		return 1; // usuário inexistente
	}
}