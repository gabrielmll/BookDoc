package Sistema;

import java.util.Random;

/**
 * Entidade Externa cuida de tarefas realizadas por indivíduos externos ao
 * sistema, que são: Diretoria, SERASA e Operadora de Convênio
 * 
 */
public class EntidadeExterna {

	/**
	 * "No caso de atendimento de cortesia, a cada 5 pedidos, 1 deverá ser recusado"
	 * 
	 * @return true para autorizado ou false para recusado
	 */

	public static boolean diretoriaAutorizaCortesia() {
		return percentagemAleatoria(20);
	}

	/**
	 * "No caso de cheques, um sorteio aleatório deverá ser usado para recusar, ou não, o cheque"
	 * 
	 * @return true para autorizado ou false para recusado
	 */
	public static boolean pagamentoCheque() {
		return sorteio();
	}

	/**
	 * "No caso de cartão (débito ou crédito) supor que sempre podem ser liberados"
	 * 
	 * @return sempre true - autorizado
	 */
	private static boolean pagamentoCartao() {
		return true;
	}

	/**
	 * "No caso de convênio, a cada 10 solicitações atendidas, uma deverá ser
	 * submetida a um sorteio aleatório para definir se o atendimento será
	 * autorizado, ou não"
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
	 * "No caso de pagamento em dinheiro, a autorização não tem restrições"
	 * 
	 * @return sempre true
	 */
	private static boolean pagamentoDinheiro() {
		return true;
	}

	/**
	 * Valores abaixo de probFalse estarão falsos
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
