/**
 * 
 */
package Testes;

import Sistema.*;

/**
 * @author Gabriel Mello
 *
 */
public class RunTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		criaSistema();

	}
	
	public static void criaSistema(){
		String clinica = "L'hopital";
		
		Sistema sis = new Sistema(clinica);
		
		System.out.println("-=- " + sis.getClinica().toString() + " -=-");
		
	}

}
