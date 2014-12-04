package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.WindowListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

@SuppressWarnings({ "serial", "unused" })

public class JanelaCadastro extends JFrame {

	public static JFrame frameJanelaCadastro;
	public static EventoCadastro manipulador;
	public static CloseWindows closer;
	public static JPanel contentPanel;
	public static JPanel panel;
	protected static JLabel labelID;
	protected static JLabel lblCadastro;
	protected static JLabel lblId;
	protected static JLabel lblNome;
	protected static JLabel lblIdentidade;
	protected static JLabel lblCpf;
	protected static JLabel lblEndereo;
	protected static JLabel lblTelefone;
	protected static JLabel lblNascimento;
	protected static JLabel lblSenha;
	protected static JLabel lblConfirmaSenha;
	protected static JTextField textNome;
	protected static JTextField textIdentidade;
	protected static JTextField textCPF;
	protected static JTextField textEndereco;
	protected static JTextField textTel;
	protected static JTextField textNascimento;
	protected static JPasswordField passwordField;
	protected static JPasswordField confPasswordField;
	protected static JButton btnLimpar;
	protected static JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frameJanelaCadastro = new JanelaCadastro();
					JanelaCadastro.frameJanelaCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaCadastro() {
		initialize();
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameJanelaCadastro = new JFrame();
		frameJanelaCadastro.setBounds(100, 100, 1000, 600);
		frameJanelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameJanelaCadastro.getContentPane().setLayout(null);

		telaCadastro();
	}

	private void telaCadastro() {

		manipulador = new EventoCadastro();
		closer = new CloseWindows();

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(300, 89, 400, 400);
		contentPanel.setLayout(null);
		frameJanelaCadastro.getContentPane().add(contentPanel);

		lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(161, 5, 78, 21);
		lblCadastro.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPanel.add(lblCadastro);

		lblId = new JLabel("Identificador");
		lblId.setBounds(164, 40, 72, 15);
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(lblId);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 90, 52, 15);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(lblNome);

		lblIdentidade = new JLabel("Identidade");
		lblIdentidade.setBounds(25, 180, 62, 15);
		contentPanel.add(lblIdentidade);
		lblIdentidade.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(175, 180, 25, 15);
		contentPanel.add(lblCpf);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(25, 135, 52, 15);
		contentPanel.add(lblEndereo);
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(295, 85, 78, 25);
		contentPanel.add(lblTelefone);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(295, 177, 62, 15);
		contentPanel.add(lblNascimento);
		lblNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(155, 226, 55, 15);
		contentPanel.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblConfirmaSenha = new JLabel("Confirma Senha");
		lblConfirmaSenha.setBounds(155, 270, 141, 15);
		contentPanel.add(lblConfirmaSenha);
		lblConfirmaSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));

		labelID = new JLabel("123453");
		labelID.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		labelID.setSize(50, 25);
		labelID.setLocation(175, 55);
		//labelID.setBounds(141, 30, 46, 14);
		contentPanel.add(labelID);

		textNome = new JTextField();
		textNome.setBounds(15, 105, 260, 20);
		contentPanel.add(textNome);
		textNome.setColumns(10);

		textIdentidade = new JTextField();
		textIdentidade.setColumns(10);
		textIdentidade.setBounds(15, 195, 140, 20);
		contentPanel.add(textIdentidade);

		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(165, 195, 110, 20);
		contentPanel.add(textCPF);

		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(15, 150, 370, 20);
		contentPanel.add(textEndereco);

		textTel = new JTextField();
		textTel.setColumns(10);
		textTel.setBounds(285, 105, 100, 20);
		contentPanel.add(textTel);

		textNascimento = new JTextField();
		textNascimento.setColumns(10);
		textNascimento.setBounds(285, 195, 100, 20);
		contentPanel.add(textNascimento);

		passwordField = new JPasswordField();
		passwordField.setBounds(145, 240, 109, 20);
		contentPanel.add(passwordField);

		confPasswordField = new JPasswordField();
		confPasswordField.setBounds(145, 285, 109, 20);
		contentPanel.add(confPasswordField);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(220, 320, 90, 35);
		btnLimpar.addActionListener(manipulador);
		contentPanel.add(btnLimpar);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(90, 320, 90, 35);
		btnCadastrar.addActionListener(manipulador);
		contentPanel.add(btnCadastrar);
	
		addWindowListener(closer);
	}
}
