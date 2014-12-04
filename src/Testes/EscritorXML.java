package Testes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import Sistema.*;

public class EscritorXML {

	static XMLOutputter xout = new XMLOutputter();

	public static void criarXML() {
		Element listas = new Element("listas");
		Document myDoc = new Document(listas);

		Element clinica = new Element("clinica");
		Element nomeClinica = new Element("nome");
		nomeClinica.setText("L'hopital");
		clinica.addContent(nomeClinica);

		listas.addContent(clinica);

		listas.addContent(criaPessoas());
		listas.addContent(criaExames());
		listas.addContent(criaConsultas());

		try {
			FileWriter arquivo = new FileWriter(new File(
					"src/Testes/teste2.xml"));
			xout.output(myDoc, arquivo);
		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	private static Element criaConsultas() {
		Element consultas = new Element("consultas");

		Sistema.getListas();
		for (Consulta c : Listas.getConsultas()) {
			Element consulta = new Element("consulta");

			Element data = new Element("data").setText(String.valueOf(c
					.getData()));
			Element idMedico = new Element("idMedico").setText(String.valueOf(c
					.getMedico().getId()));
			Element idCliente = new Element("idCliente").setText(String
					.valueOf(c.getCliente().getId()));
			Element tipo = new Element("tipo").setText(String.valueOf(c
					.getTipo()));

			consulta.addContent(data);
			consulta.addContent(idMedico);
			consulta.addContent(idCliente);
			consulta.addContent(tipo);

			consultas.addContent(consulta);
		}

		return consultas;
	}

	private static Element criaExames() {
		Element exames = new Element("exames");

		Sistema.getListas();
		for (Exame e : Listas.getExames()) {
			Element exame = new Element("exame");

			Element nome = new Element("nome").setText(e.getNome());
			Element tipo = new Element("tipo").setText(String.valueOf(e
					.getTipo()));
			Element data = new Element("data").setText(String.valueOf(e
					.getData()));
			Element idCliente = new Element("idCliente").setText(String
					.valueOf(e.getCliente().getId()));

			exame.addContent(nome);
			exame.addContent(tipo);
			exame.addContent(data);
			exame.addContent(idCliente);

			exames.addContent(exame);
		}

		return exames;
	}

	private static Element criaPessoas() {
		Element pessoas = new Element("pessoas");
		Element clientes = new Element("clientes");
		Element medicos = new Element("medicos");
		Element funcionarios = new Element("funcionarios");
		Element tecnicos = new Element("tecnicos");

		for (Pessoa p : Sistema.getListas().getPessoas()) {
			if (p instanceof Cliente) {
				Element cliente = new Element("cliente");

				Element nome = new Element("nome").setText(p.getNome());
				Element identidade = new Element("identidade").setText(p
						.getIdentidade());
				Element cpf = new Element("cpf").setText(p.getCpf());
				Element endereco = new Element("endereco").setText(p
						.getEndereco());
				Element telefone = new Element("telefone").setText(p
						.getTelefone());
				Element nascimento = new Element("nascimento").setText(p
						.getNascimento());
				Element senha = new Element("senha").setText(((Cliente) p)
						.getSenha());

				cliente.addContent(nome);
				cliente.addContent(identidade);
				cliente.addContent(cpf);
				cliente.addContent(endereco);
				cliente.addContent(telefone);
				cliente.addContent(nascimento);
				cliente.addContent(senha);

				clientes.addContent(cliente);
			}
			if (p instanceof Medico) {
				Element medico = new Element("medico");

				Element nome = new Element("nome").setText(p.getNome());
				Element identidade = new Element("identidade").setText(p
						.getIdentidade());
				Element cpf = new Element("cpf").setText(p.getCpf());
				Element endereco = new Element("endereco").setText(p
						.getEndereco());
				Element telefone = new Element("telefone").setText(p
						.getTelefone());
				Element nascimento = new Element("nascimento").setText(p
						.getNascimento());
				Element especialidade = new Element("especialidade")
						.setText(((Medico) p).getEspecialidade());

				Element datas = new Element("datas");
/*
				for (String horario : ((Medico) p).getAgendaMedico()
						.getHorariosOcupados()) {
					Element data = new Element("data").setText(horario);
					
					datas.addContent(data);
				}*/

				medico.addContent(nome);
				medico.addContent(identidade);
				medico.addContent(cpf);
				medico.addContent(endereco);
				medico.addContent(telefone);
				medico.addContent(nascimento);
				medico.addContent(especialidade);
				medico.addContent(datas);

				medicos.addContent(medico);
			}
			if (p instanceof Funcionario) {
				Element funcionario = new Element("funcionario");

				Element nome = new Element("nome").setText(p.getNome());
				Element identidade = new Element("identidade").setText(p
						.getIdentidade());
				Element cpf = new Element("cpf").setText(p.getCpf());
				Element endereco = new Element("endereco").setText(p
						.getEndereco());
				Element telefone = new Element("telefone").setText(p
						.getTelefone());
				Element nascimento = new Element("nascimento").setText(p
						.getNascimento());
				Element cargo = new Element("cargo").setText(((Funcionario) p)
						.getCargo());

				funcionario.addContent(nome);
				funcionario.addContent(identidade);
				funcionario.addContent(cpf);
				funcionario.addContent(endereco);
				funcionario.addContent(telefone);
				funcionario.addContent(nascimento);
				funcionario.addContent(cargo);

				funcionarios.addContent(funcionario);
			}
			if (p instanceof Tecnico) {
				Element tecnico = new Element("tecnico");

				Element nome = new Element("nome").setText(p.getNome());
				Element identidade = new Element("identidade").setText(p
						.getIdentidade());
				Element cpf = new Element("cpf").setText(p.getCpf());
				Element endereco = new Element("endereco").setText(p
						.getEndereco());
				Element telefone = new Element("telefone").setText(p
						.getTelefone());
				Element nascimento = new Element("nascimento").setText(p
						.getNascimento());
				Element especialidade = new Element("especialidade")
						.setText(((Tecnico) p).getEspecialidade());

				tecnico.addContent(nome);
				tecnico.addContent(identidade);
				tecnico.addContent(cpf);
				tecnico.addContent(endereco);
				tecnico.addContent(telefone);
				tecnico.addContent(nascimento);
				tecnico.addContent(especialidade);

				tecnicos.addContent(tecnico);
			}
		}

		pessoas.addContent(clientes);
		pessoas.addContent(medicos);
		pessoas.addContent(funcionarios);
		pessoas.addContent(tecnicos);

		return pessoas;
	}
}
