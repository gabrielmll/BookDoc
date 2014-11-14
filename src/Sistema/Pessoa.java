/**
 * Pessoa é uma classe que engloba as entidades Médico, Cliente, Técnico e Funcionário. 
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