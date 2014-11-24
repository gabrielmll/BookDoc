package GUI;

import java.awt.EventQueue;

public class BookDocGUI {

	public static void main(String[] args) {
		Testes.LeitorXML.populaSistema();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLogin window = new JanelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}