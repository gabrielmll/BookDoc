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

		populaSistema();

	}

	public static void populaSistema() {
		File f = new File("src/Testes/input.xml");
		Sistema sis;
		SAXBuilder builder = new SAXBuilder();

		Document doc;

		try {
			doc = builder.build(f);

			Element root = (Element) doc.getRootElement();

			Element clinica = root.getChild("clinica");
			sis = criaSistema(clinica.getChildText("nome"));

			List<Element> pessoas = root.getChildren("pessoas");
			populaPessoas(sis, pessoas);

			System.out.println(sis.getListas().toString());

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

		Listas l = new Listas();

		for (Element p : pessoas) {
			// Clientes
			List<Element> clientes = p.getChildren("clientes");

			for (Element cs : clientes) {
				List<Element> cliente = cs.getChildren("cliente");

				for (Element individuo : cliente) {
					Cliente c = new Cliente(0, individuo.getChildText("nome"));
					l.getPessoas().add(c);
				}
			}

			// Medicos
			List<Element> medicos = p.getChildren("medicos");

			for (Element ms : medicos) {
				List<Element> medico = ms.getChildren("medico");

				for (Element individuo : medico) {
					Medico m = new Medico(0, individuo.getChildText("nome"),
							individuo.getChildText("especialidade"));
					l.getPessoas().add(m);
				}
			}

			// Tecnicos
			List<Element> tecnicos = p.getChildren("tecnicos");

			for (Element ts : tecnicos) {
				List<Element> tecnico = ts.getChildren("tecnico");

				for (Element individuo : tecnico) {
					Tecnico t = new Tecnico(0, individuo.getChildText("nome"),
							individuo.getChildText("especialidade"));
					l.getPessoas().add(t);
				}
			}

			// Funcionarios
			List<Element> funcionarios = p.getChildren("funcionarios");

			for (Element fs : funcionarios) {
				List<Element> funcionario = fs.getChildren("funcionario");

				for (Element individuo : funcionario) {
					Funcionario f = new Funcionario(0,
							individuo.getChildText("nome"),
							individuo.getChildText("cargo"));
					l.getPessoas().add(f);
				}
			}
		}

		sis.setListas(l);

		// sis.getListas().toString();
	}
}
