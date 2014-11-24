package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textIdentidade;
	private JTextField textCPF;
	private JTextField textEndereco;
	private JTextField textSenha;
	private JTextField textConfSenha;
	private JTextField textTel;
	private JTextField textNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 58, 964, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 21, 21, 25);
		panel.add(lblId);
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 74, 52, 25);
		panel.add(lblNome);
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblIdentidade = new JLabel("Identidade");
		lblIdentidade.setBounds(10, 127, 96, 25);
		panel.add(lblIdentidade);
		lblIdentidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdentidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 180, 33, 25);
		panel.add(lblCpf);
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 233, 82, 25);
		panel.add(lblEndereo);
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(595, 143, 78, 25);
		panel.add(lblTelefone);
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(569, 179, 104, 25);
		panel.add(lblNascimento);
		lblNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(389, 300, 55, 25);
		panel.add(lblSenha);
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblConfirmaSenha = new JLabel("Confirma Senha");
		lblConfirmaSenha.setBounds(303, 337, 141, 25);
		panel.add(lblConfirmaSenha);
		lblConfirmaSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmaSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		lblCamposObrigatrios.setBounds(10, 392, 161, 14);
		panel.add(lblCamposObrigatrios);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(340, 434, 89, 23);
		panel.add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(526, 434, 89, 23);
		panel.add(btnCadastrar);
		
		JLabel label = new JLabel("1");
		label.setBounds(141, 30, 46, 14);
		panel.add(label);
		
		textNome = new JTextField();
		textNome.setBounds(141, 80, 250, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textIdentidade = new JTextField();
		textIdentidade.setColumns(10);
		textIdentidade.setBounds(141, 133, 250, 20);
		panel.add(textIdentidade);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(141, 186, 250, 20);
		panel.add(textCPF);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(141, 239, 250, 20);
		panel.add(textEndereco);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(454, 306, 161, 20);
		panel.add(textSenha);
		
		textConfSenha = new JTextField();
		textConfSenha.setColumns(10);
		textConfSenha.setBounds(454, 343, 161, 20);
		panel.add(textConfSenha);
		
		textTel = new JTextField();
		textTel.setColumns(10);
		textTel.setBounds(683, 149, 250, 20);
		panel.add(textTel);
		
		textNascimento = new JTextField();
		textNascimento.setColumns(10);
		textNascimento.setBounds(683, 185, 250, 20);
		panel.add(textNascimento);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setBounds(0, 0, 168, 36);
		contentPane.add(lblCadastro);
		lblCadastro.setFont(new Font("Times New Roman", Font.BOLD, 30));
	}
}
