/**
 * Pessoa � uma classe que engloba as entidades M�dico, Cliente, T�cnico e Funcion�rio. 
 */
package Sistema;

/**
 *
 *
 */
public class Pessoa {
	private String nome;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	
	public String toString(){
		return nome;
	}

	public String getNome() {
		return nome;
	}
	
	public int getId(){
		return -1;
	}
}