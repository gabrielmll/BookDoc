package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Sistema.Sistema;

//@SuppressWarnings("unused")

public class EventoLogin implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Entrar") {
			int login = Sistema.validaLogin(JanelaLogin.idLogin.getText(),
					JanelaLogin.senhaLogin.getText());

			if (login == 0) {
				
				System.out.println("Logado com sucesso!");
				JanelaLogin.frameJanelaLogin.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							JanelaAgendamento janelaAgendamento = new JanelaAgendamento();
							janelaAgendamento.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			} else if (login == 1) {
				System.out.println("Usuário inexistente!");
			} else {
				System.out.println("Senha incorreta!");
			}
		}
		
		if (e.getActionCommand() == "Cadastrar") {
			
			System.out.println("Iniciando cadastro!");
			JanelaLogin.frameJanelaLogin.setVisible(false);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JanelaCadastro janelaCadastro = new JanelaCadastro();
						janelaCadastro.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}