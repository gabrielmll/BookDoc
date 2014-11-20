package Sistema;

import java.util.Random;

/**
 * Entidade Externa cuida de tarefas realizadas por indiv�duos externos ao
 * sistema, que s�o: Diretoria, SERASA e Operadora de Conv�nio
 * 
 */
public class EntidadeExterna {

	/**
	 * "No caso de atendimento de cortesia, a cada 5 pedidos, 1 dever� ser recusado"
	 * 
	 * @return true para autorizado ou false para recusado
	 */

	public static boolean diretoriaAutorizaCortesia() {
		return percentagemAleatoria(20);
	}

	/**
	 * "No caso de cheques, um sorteio aleat�rio dever� ser usado para recusar, ou n�o, o cheque"
	 * 
	 * @return true para autorizado ou false para recusado
	 */
	public static boolean pagamentoCheque() {
		return sorteio();
	}

	/**
	 * "No caso de cart�o (d�bito ou cr�dito) supor que sempre podem ser liberados"
	 * 
	 * @return sempre true - autorizado
	 */
	private static boolean pagamentoCartao() {
		return true;
	}

	/**
	 * "No caso de conv�nio, a cada 10 solicita��es atendidas, uma dever� ser
	 * submetida a um sorteio aleat�rio para definir se o atendimento ser�
	 * autorizado, ou n�o"
	 * 
	 * @return true para autorizado ou false para recusado
	 */
	private static boolean operadoraAtuorizaConvenio() {
		if (percentagemAleatoria(90)) {
			return sorteio();
		}

		return true;
	}

	/**
	 * "No caso de pagamento em dinheiro, a autoriza��o n�o tem restri��es"
	 * 
	 * @return sempre true
	 */
	private static boolean pagamentoDinheiro() {
		return true;
	}

	/**
	 * Valores abaixo de probFalse estar�o falsos
	 */
	private static boolean percentagemAleatoria(int probFalse) {

		Random rand = new Random();
		int result = rand.nextInt(100);

		if (result < probFalse) {
			return false;
		}

		return true;
	}

	private static boolean sorteio() {
		Random rand = new Random();
		int result = rand.nextInt(100);

		if (result % 2 == 0) {
			return true;
		}

		return false;
	}
}
