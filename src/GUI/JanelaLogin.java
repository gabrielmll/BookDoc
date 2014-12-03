package GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class JanelaLogin {

	public static JFrame frame;
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
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		telaLogin();
	}

	private void telaLogin() {
		EventoLogin manipulador = new EventoLogin();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(400, 189, 200, 200);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel labelId = new JLabel("Identificador");
		labelId.setBounds(25, 44, 68, 15);
		labelId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelId);

		idLogin = new JTextField();
		idLogin.setBounds(15, 60, 170, 29);
		idLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idLogin.setColumns(10);
		panel.add(idLogin);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(25, 97, 33, 15);
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelSenha);

		senhaLogin = new JTextField();
		senhaLogin.setBounds(15, 113, 170, 30);
		senhaLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		senhaLogin.setColumns(10);
		panel.add(senhaLogin);

		JButton entrarLogin = new JButton("Entrar");
		entrarLogin.setBounds(6, 154, 90, 35);
		entrarLogin.addActionListener(manipulador);
		panel.add(entrarLogin);

		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(104, 154, 90, 35);
		panel.add(cadastrar);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(76, 6, 48, 21);
		panel.add(lblNewLabel);
		cadastrar.addActionListener(manipulador);

	}
}
