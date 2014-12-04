package GUI;

import java.awt.EventQueue;

@SuppressWarnings("unused")

public class BookDocGUI {

	public static void main(String[] args) {
		Testes.LeitorXML.populaSistema();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLogin frameJanelaLogin = new JanelaLogin();
					JanelaLogin.frameJanelaLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}