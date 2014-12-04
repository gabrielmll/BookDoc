
/**
 * Classe que gerencia agendas. As disponibilidades de m�dicos e exames s�o guiados por uma agenda.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 *
 */
public class Agenda {
	ArrayList<String> horariosOcupados = new ArrayList<String>();
	
	public void addData(String data){
		horariosOcupados.add(data);
	}
	
	public ArrayList<String> getHorariosOcupados(){
		return horariosOcupados;
	}
}
