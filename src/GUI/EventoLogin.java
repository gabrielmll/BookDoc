package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.java.swing.plaf.windows.resources.windows;

import Sistema.Sistema;

public class EventoLogin implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Entrar") {
			int login = Sistema.validaLogin(JanelaLogin.idLogin.getText(),
					JanelaLogin.senhaLogin.getText());

			if (login == 0) {
				System.out.println("Logado com sucesso!");
			} else if (login == 1) {
				System.out.println("Usuário inexistente!");
			} else {
				System.out.println("Senha incorreta!");
			}
		} else if (e.getActionCommand() == "Cadastrar") {
			
			JanelaLogin.frame.setVisible(false);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JanelaCadastro frame = new JanelaCadastro();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}