/**
 * 
 */
package Sistema;

/**
 * @author Gabriel Mello
 *
 */
public class Clinica {
	private String nome;
	
	Clinica(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString(){
		return nome;
	}
}