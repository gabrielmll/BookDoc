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
 *
 * 
 */
public class RunTester {

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

			// Clinica
			Element clinica = root.getChild("clinica");
			sis = criaSistema(clinica.getChildText("nome"));

			// Pessoas
			List<Element> pessoas = root.getChildren("pessoas");
			populaPessoas(sis, pessoas);

			// Exames
			List<Element> exames = root.getChildren("exames");
			populaExames(sis, exames);

			System.out.println(sis.getListas().toString());

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
			// Clientes
			List<Element> clientes = p.getChildren("clientes");

			for (Element cs : clientes) {
				List<Element> cliente = cs.getChildren("cliente");

				for (Element individuo : cliente) {
					Cliente c = new Cliente(0, individuo.getChildText("nome"));
					sis.addPessoa(c);
				}
			}

			// Medicos
			List<Element> medicos = p.getChildren("medicos");

			for (Element ms : medicos) {
				List<Element> medico = ms.getChildren("medico");

				for (Element individuo : medico) {
					Medico m = new Medico(0, individuo.getChildText("nome"),
							individuo.getChildText("especialidade"));
					sis.addPessoa(m);
				}
			}

			// Tecnicos
			List<Element> tecnicos = p.getChildren("tecnicos");

			for (Element ts : tecnicos) {
				List<Element> tecnico = ts.getChildren("tecnico");

				for (Element individuo : tecnico) {
					Tecnico t = new Tecnico(0, individuo.getChildText("nome"),
							individuo.getChildText("especialidade"));
					sis.addPessoa(t);
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
					sis.addPessoa(f);
				}
			}
		}
	}

	public static void populaExames(Sistema sis, List<Element> exames) {
		for (Element e : exames) {
			List<Element> exame = e.getChildren("exame");

			for (Element cadaExame : exame) {
				Cliente c = (Cliente)sis.getListas().getClienteById(Integer.parseInt(cadaExame.getChildText("idCliente")));
				if (c != null){
					sis.addExame(new Exame(c));
				}
			}
		}
	}
	
	public static void populaConsultas(Sistema sis, List<Element> consultas) {
		for (Element c : consultas) {
			List<Element> consulta = c.getChildren("consulta");

			for (Element cadaConsulta : consulta) {
				Cliente cl = (Cliente)sis.getListas().getClienteById(Integer.parseInt(cadaConsulta.getChildText("idCliente")));
				Medico md = (Medico)sis.getListas().getMedicoById(Integer.parseInt(cadaConsulta.getChildText("idMedico")));
				if (cl != null){
					sis.addConsulta(new Consulta(md, cl));
				}
			}
		}
	}
}
