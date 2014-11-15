/**
 * Cliente � uma pessoa que receber� os servi�os do hospital. 
 */
package Sistema;

import java.util.ArrayList;

/**
 *
 *
 */
public class Cliente extends Pessoa{
	int id;
	private ArrayList<Exame> exames = new ArrayList<Exame>();
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
	public Cliente(int id, String nome){
		super(nome);
		this.id = id;
	}

	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
}
