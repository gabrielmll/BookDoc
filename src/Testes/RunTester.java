/**
 * 
 */
package Testes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Sistema.Sistema;

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

		populaSistema();
		//criaSistema();

	}

	public static void criaSistema() {
		String clinica = "L'hopital";

		Sistema sis = new Sistema(clinica);

		System.out.println("-=- " + sis.getClinica().toString() + " -=-");

	}

	public static void populaSistema() {
		File f = new File("src/Testes/input.xml");

		SAXBuilder builder = new SAXBuilder();

		Document doc;
		
		try {
			doc = builder.build(f);

			Element root = (Element) doc.getRootElement();

			List pessoas = root.getChildren("pessoas");
			System.out.println(pessoas);
/*			Iterator i = pessoas.iterator();

			while (i.hasNext()) {
				Element pessoa = (Element) i.next();
				System.out.println("Nome: " + pessoa.getChildText("nome"));
				System.out.println("Sobrenome: "
						+ pessoa.getChildText("sobrenome"));
				System.out.println("Sexo: " + pessoa.getAttributeValue("sexo"));
				System.out.println("Nota( teste1 ): "
						+ pessoa.getChild("notas").getChildText("teste1"));
				System.out.println("Nota( teste2 ): "
						+ pessoa.getChild("notas").getChildText("teste2"));
				System.out.println("Nota( prova ): "
						+ pessoa.getChild("notas").getChildText("prova"));
				System.out.println();
			}
*/
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
