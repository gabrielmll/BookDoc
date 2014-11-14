/**
 * Pessoa � uma classe que engloba as entidades M�dico, Cliente, T�cnico e Funcion�rio. 
 */
package Sistema;

/**
 *
 *
 */
public class Pessoa {
	private int id;
	private String nome;
	
	Pessoa(int id, String nome){
		this.nome = nome;
		this.id = id;
	}
	
	public String toString(){
		return nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}