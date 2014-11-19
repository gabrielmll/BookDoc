package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Sistema.Sistema;

public class EventoLogin implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		int login = Sistema.validaLogin(JanelaLogin.idLogin.getText(),
				JanelaLogin.senhaLogin.getText());

		if (login == 0) {
			System.out.println("Logado com sucesso!");
		} else if (login == 1) {
			System.out.println("Usuário inexistente!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
}