package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import Sistema.*;
import Testes.LeitorXML;
import Sistema.Sistema;

public class EventoCadastro implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Cadastrar") {
			String id = JanelaCadastro.labelID.getText();
			String nome = JanelaCadastro.textNome.getText();
			String identidade = JanelaCadastro.textIdentidade.getText();
			String cpf = JanelaCadastro.textCPF.getText();
			String end = JanelaCadastro.textEndereco.getText();
			String tel = JanelaCadastro.textTel.getText();
			String nasc = JanelaCadastro.textNascimento.getText();

			String pass = JanelaCadastro.passwordField.getText();
			String pass2 = JanelaCadastro.confPasswordField.getText();

			System.out.println(id + "\n" + nome + "\n" + identidade + "\n"
					+ cpf + "\n" + end + "\n" + tel + "\n" + nasc + "\n" + pass
					+ "\n" + pass2);

			Cliente c = new Cliente(-1, nome, identidade, cpf, end, tel, nasc,
					pass);

			Sistema.getListas().toString();
		}

		else if (e.getActionCommand() == "Limpar") {

			JanelaCadastro.textNome.setText("");
			JanelaCadastro.textIdentidade.setText("");
			JanelaCadastro.textCPF.setText("");
			JanelaCadastro.textEndereco.setText("");
			JanelaCadastro.textTel.setText("");
			JanelaCadastro.textNascimento.setText("");

			JanelaCadastro.passwordField.setText("");
			JanelaCadastro.confPasswordField.setText("");
		}
	}
}