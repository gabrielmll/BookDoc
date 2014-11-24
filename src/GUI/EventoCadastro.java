package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Sistema.Sistema;

public class EventoCadastro implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = JanelaCadastro.labelID.getText();
		String nome = JanelaCadastro.textNome.getText();
		String identidade = JanelaCadastro.textIdentidade.getText();
		String cpf = JanelaCadastro.textCPF.getText();
		String end = JanelaCadastro.textEndereco.getText();
		String tel = JanelaCadastro.textTel.getText();
		String nasc = JanelaCadastro.textNascimento.getText();
		
		String pass = JanelaCadastro.passwordField.getText();
		String pass2 = JanelaCadastro.confPasswordField.getText();
		
		System.out.println(id + "\n" + nome + "\n" + identidade + "\n" + cpf + "\n" + end + "\n" + tel + "\n" + nasc + "\n" + pass + "\n" + pass2);
	}
}