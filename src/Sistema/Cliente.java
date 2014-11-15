/**
 * Cliente é uma pessoa que receberá os serviços do hospital. 
 */
package Sistema;

import java.util.ArrayList;

/**
 *
 *
 */
public class Cliente extends Pessoa{
	private ArrayList<Exame> exames = new ArrayList<Exame>();
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
	public Cliente(int id, String nome){
		super(id, nome);
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
	
}
