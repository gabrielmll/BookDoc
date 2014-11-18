package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPadrao {

	private JFrame frame;
	private JTextField senhaLogin;
	private JTextField idLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPadrao window = new JanelaPadrao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPadrao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//telaLogin();
	}

	private void telaLogin() {

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(343, 216, 46, 14);
		frame.getContentPane().add(lblId);

		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(343, 247, 46, 14);
		frame.getContentPane().add(lblSenha);

		senhaLogin = new JTextField();
		senhaLogin.setBounds(400, 244, 86, 20);
		frame.getContentPane().add(senhaLogin);
		senhaLogin.setColumns(10);

		idLogin = new JTextField();
		idLogin.setBounds(400, 213, 86, 20);
		frame.getContentPane().add(idLogin);
		idLogin.setColumns(10);

		JButton entrarLogin = new JButton("Entrar");
		entrarLogin.setBounds(399, 275, 89, 23);
		frame.getContentPane().add(entrarLogin);
	}
}
