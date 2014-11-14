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
	private Listas listas;	// listas contem Pessoas, Exames e Consultas
	
	Sistema(String nomeClinica){
		clinica = new Clinica(nomeClinica);
	}
}