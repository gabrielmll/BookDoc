package GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;

@SuppressWarnings("unused")

public class JanelaLogin {

	public static JFrame frameJanelaLogin;
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
						JanelaLogin frameJanelaLogin = new JanelaLogin();
						JanelaLogin.frameJanelaLogin.setVisible(true);
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
		frameJanelaLogin = new JFrame();
		frameJanelaLogin.setBounds(100, 100, 400, 400);
		frameJanelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameJanelaLogin.getContentPane().setLayout(null);

		telaLogin();
	}

	private void telaLogin() {
		
		EventoLogin manipulador = new EventoLogin();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(100, 100, 200, 200);
		panel.setLayout(null);
		frameJanelaLogin.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(76, 5, 48, 21);
		panel.add(lblNewLabel);

		JLabel labelId = new JLabel("Identificador");
		labelId.setBounds(25, 40, 68, 15);
		labelId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelId);

		idLogin = new JTextField();
		idLogin.setBounds(15, 55, 170, 29);
		idLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idLogin.setColumns(10);
		panel.add(idLogin);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(25, 90, 33, 15);
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelSenha);

		senhaLogin = new JTextField();
		senhaLogin.setBounds(15, 105, 170, 30);
		senhaLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		senhaLogin.setColumns(10);
		panel.add(senhaLogin);

		JButton entrarLogin = new JButton("Entrar");
		entrarLogin.setBounds(6, 150, 90, 35);
		entrarLogin.addActionListener(manipulador);
		panel.add(entrarLogin);

		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(104, 150, 90, 35);
		cadastrar.addActionListener(manipulador);
		panel.add(cadastrar);

	}
}
