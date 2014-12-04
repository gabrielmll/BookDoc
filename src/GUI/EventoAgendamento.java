package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Sistema.Sistema;

@SuppressWarnings("unused")

public class EventoAgendamento implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Novo Exame") {
				
			System.out.println("Novo exame!");
			JanelaAgendamento.frameJanelaAgendamento.setVisible(false);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JanelaExame janelaExame = new JanelaExame();
						JanelaExame.frameJanelaExame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		if (e.getActionCommand() == "Nova Consulta") {
			
			System.out.println("Novo exame!");
			JanelaAgendamento.frameJanelaAgendamento.setVisible(false);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JanelaConsulta janelaConsulta = new JanelaConsulta();
						JanelaConsulta.frameJanelaConsulta.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}