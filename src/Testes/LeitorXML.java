package Testes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Sistema.*;

public class LeitorXML {

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

			// Consultas
			List<Element> consultas = root.getChildren("consultas");
			populaConsultas(sis, consultas);

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

	private static Pessoa criaPessoa(String nome, String identidade,
			String cpf, String endereco, String telefone, String nascimento) {
		Pessoa p = new Pessoa(nome, identidade, cpf, endereco, telefone,
				nascimento);

		return p;
	}

	public static void populaPessoas(Sistema sis, List<Element> pessoas) {

		for (Element p : pessoas) {
			// Clientes
			List<Element> clientes = p.getChildren("clientes");

			for (Element cs : clientes) {
				List<Element> cliente = cs.getChildren("cliente");

				for (Element individuo : cliente) {

					String nome = individuo.getChildText("nome");
					String identidade = individuo.getChildText("identidade");
					String cpf = individuo.getChildText("cpf");
					String endereco = individuo.getChildText("endereco");
					String telefone = individuo.getChildText("telefone");
					String nascimento = individuo.getChildText("nascimento");
					String senha = individuo.getChildText("senha");

					Cliente c = new Cliente(0, criaPessoa(nome, identidade,
							cpf, endereco, telefone, nascimento), senha);

					sis.addPessoa(c);
				}
			}

			// Medicos
			List<Element> medicos = p.getChildren("medicos");

			for (Element ms : medicos) {
				List<Element> medico = ms.getChildren("medico");

				for (Element individuo : medico) {

					String nome = individuo.getChildText("nome");
					String identidade = individuo.getChildText("identidade");
					String cpf = individuo.getChildText("cpf");
					String endereco = individuo.getChildText("endereco");
					String telefone = individuo.getChildText("telefone");
					String nascimento = individuo.getChildText("nascimento");
					String especialidade = individuo
							.getChildText("especialidade");

					Medico m = new Medico(0, criaPessoa(nome, identidade, cpf,
							endereco, telefone, nascimento), especialidade);
					
					Element datas = individuo.getChild("datas");
					List<Element> ds = datas.getChildren("data");
					System.out.println(ds);
					for (Element data : ds){
						String date = data.getValue();
						m.getAgendaMedico().addData(date);
						System.out.println(date);
					}

					sis.addPessoa(m);
				}
			}

			// Tecnicos
			List<Element> tecnicos = p.getChildren("tecnicos");

			for (Element ts : tecnicos) {
				List<Element> tecnico = ts.getChildren("tecnico");

				for (Element individuo : tecnico) {

					String nome = individuo.getChildText("nome");
					String identidade = individuo.getChildText("identidade");
					String cpf = individuo.getChildText("cpf");
					String endereco = individuo.getChildText("endereco");
					String telefone = individuo.getChildText("telefone");
					String nascimento = individuo.getChildText("nascimento");
					String especialidade = individuo
							.getChildText("especialidade");

					Tecnico t = new Tecnico(0, criaPessoa(nome, identidade,
							cpf, endereco, telefone, nascimento), especialidade);

					sis.addPessoa(t);
				}
			}

			// Funcionarios
			List<Element> funcionarios = p.getChildren("funcionarios");

			for (Element fs : funcionarios) {
				List<Element> funcionario = fs.getChildren("funcionario");

				for (Element individuo : funcionario) {

					String nome = individuo.getChildText("nome");
					String identidade = individuo.getChildText("identidade");
					String cpf = individuo.getChildText("cpf");
					String endereco = individuo.getChildText("endereco");
					String telefone = individuo.getChildText("telefone");
					String nascimento = individuo.getChildText("nascimento");
					String cargo = individuo.getChildText("cargo");

					Funcionario f = new Funcionario(0, criaPessoa(nome,
							identidade, cpf, endereco, telefone, nascimento),
							cargo);

					sis.addPessoa(f);
				}
			}
		}
	}

	public static void populaExames(Sistema sis, List<Element> exames) {
		for (Element e : exames) {
			List<Element> exame = e.getChildren("exame");

			for (Element cadaExame : exame) {
				String nome = cadaExame.getChildText("nome");
				Cliente c = (Cliente) sis.getListas().getClienteById(
						Integer.parseInt(cadaExame.getChildText("idCliente")));

				// int data = Integer.parseInt(cadaExame.getChildText("data"));
				int tipo = Integer.parseInt(cadaExame.getChildText("tipo"));
				sis.addExame(new Exame(nome, c, 0, tipo));
			}
		}
	}

	public static void populaConsultas(Sistema sis, List<Element> consultas) {
		for (Element c : consultas) {
			List<Element> consulta = c.getChildren("consulta");

			for (Element cadaConsulta : consulta) {
				Cliente cl = (Cliente) sis.getListas()
						.getClienteById(
								Integer.parseInt(cadaConsulta
										.getChildText("idCliente")));
				Medico md = (Medico) sis.getListas()
						.getMedicoById(
								Integer.parseInt(cadaConsulta
										.getChildText("idMedico")));

				// int data =
				// Integer.parseInt(cadaConsulta.getChildText("data"));
				int tipo = Integer.parseInt(cadaConsulta.getChildText("tipo"));

				sis.addConsulta(new Consulta(md, cl, 0, tipo));

			}
		}
	}
}
