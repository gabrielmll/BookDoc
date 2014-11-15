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

		Sistema sis = null;
		populaSistema(sis);
		// criaSistema();

	}

	public static void populaSistema(Sistema sis) {
		File f = new File("src/Testes/input.xml");

		SAXBuilder builder = new SAXBuilder();

		Document doc;

		try {
			doc = builder.build(f);

			Element root = (Element) doc.getRootElement();

			Element clinica = root.getChild("clinica");
			sis = criaSistema(clinica.getChildText("nome"));

			List<Element> pessoas = root.getChildren("pessoas");
			populaPessoas(sis, pessoas);

		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Sistema criaSistema(String clinica) {

		Sistema sis = new Sistema(clinica);

		System.out.println("-=- " + sis.getClinica().toString() + " -=-");

		return sis;
	}

	public static void populaPessoas(Sistema sis, List<Element> pessoas) {

		for (Element p : pessoas) {
			List<Element> clientes = p.getChildren("clientes");

			for (Element cs : clientes) {
				List<Element> cliente = cs.getChildren("cliente");

				for (Element individuo : cliente) {
					System.out.println(individuo.getChildText("nome"));
					Cliente c = new Cliente(0, individuo.getChildText("nome"));
					sis.getListas().getPessoas().size();
					//sis.getListas().getPessoas().add(c);
				}
			}
		}

		//sis.getListas().toString();
	}
}
