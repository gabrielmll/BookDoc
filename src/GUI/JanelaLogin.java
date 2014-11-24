package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaLogin {

	private JFrame frame;
	protected static JTextField senhaLogin;
	protected static JTextField idLogin;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public JanelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		telaLogin();
	}

	private void telaLogin() {
		EventoLogin manipulador = new EventoLogin();

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(60, 33, 46, 14);
		frame.getContentPane().add(lblId);

		idLogin = new JTextField();
		idLogin.setBounds(117, 30, 86, 20);
		frame.getContentPane().add(idLogin);
		idLogin.setColumns(10);

		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(60, 64, 46, 14);
		frame.getContentPane().add(lblSenha);

		senhaLogin = new JTextField();
		senhaLogin.setBounds(117, 61, 86, 20);
		frame.getContentPane().add(senhaLogin);
		senhaLogin.setColumns(10);

		JButton entrarLogin = new JButton("Entrar");
		entrarLogin.setBounds(116, 92, 89, 23);
		entrarLogin.addActionListener(manipulador);
		frame.getContentPane().add(entrarLogin);
	}
}
