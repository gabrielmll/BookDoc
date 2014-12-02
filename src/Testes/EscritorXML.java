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

		Element pessoas = new Element("pessoas");
		Element clientes = new Element("clientes");

		for (Pessoa p : Sistema.getListas().getPessoas()) {
			if (p instanceof Cliente) {
				Element cliente = new Element("cliente");
				
				Element nome = new Element("nome").setText(p.getNome());
				Element identidade = new Element("identidade").setText(p.getIdentidade());
				Element cpf = new Element("cpf").setText(p.getCpf());
				Element endereco = new Element("endereco").setText(p.getEndereco());
				Element telefone = new Element("telefone").setText(p.getTelefone());
				Element nascimento = new Element("nascimento").setText(p.getNascimento());
				Element senha = new Element("senha").setText(((Cliente) p).getSenha());
				
				cliente.addContent(nome);
				cliente.addContent(identidade);
				cliente.addContent(cpf);
				cliente.addContent(endereco);
				cliente.addContent(telefone);
				cliente.addContent(nascimento);
				cliente.addContent(senha);
				
				clientes.addContent(cliente);
			}
		}
		
		pessoas.addContent(clientes);
		listas.addContent(pessoas);

		try {
			FileWriter arquivo = new FileWriter(new File(
					"src/Testes/teste1.xml"));
			xout.output(myDoc, arquivo);
		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
