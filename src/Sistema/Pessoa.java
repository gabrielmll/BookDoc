/**
 * Pessoa é uma classe que engloba as entidades Médico, Cliente, Técnico e Funcionário. 
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