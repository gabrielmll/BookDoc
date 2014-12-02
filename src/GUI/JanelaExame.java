package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import Sistema.Listas;
import javax.swing.SpringLayout;

@SuppressWarnings({ "serial", "unused" })

public class JanelaExame extends JFrame {
	
	public static JPanel contentPane;
	protected static JTextField textNome;
	protected static JTextField textIdentidade;
	protected static JTextField textCPF;
	protected static JTextField textEndereco;
	protected static JTextField textTel;
	protected static JTextField textNascimento;
	protected static JPasswordField passwordField;
	protected static JPasswordField confPasswordField;
	private SpringLayout springLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaExame frame = new JanelaExame();
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
	public JanelaExame() {

		EventoCadastro manipulador = new EventoCadastro();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 320, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastro = new JLabel("AGENDAR EXAME");
		lblCadastro.setBounds(5, 6, 320, 36);
		panel.add(lblCadastro);
		lblCadastro.setFont(new Font("Times New Roman", Font.BOLD, 33));

		JLabel labelTipo = new JLabel("Tipo");
		labelTipo.setBounds(20, 54, 50, 20);
		labelTipo.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelTipo);
		
		JLabel labelFormaPagamento = new JLabel("Forma de Pagamento");
		labelFormaPagamento.setBounds(162, 54, 132, 20);
		labelFormaPagamento.setHorizontalAlignment(SwingConstants.LEFT);
		labelFormaPagamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelFormaPagamento);
		
		JLabel labelExame = new JLabel("Exame");
		labelExame.setHorizontalAlignment(SwingConstants.LEFT);
		labelExame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelExame.setBounds(20, 107, 50, 20);
		panel.add(labelExame);

		JLabel labelData = new JLabel("Escolha uma data");
		labelData.setHorizontalAlignment(SwingConstants.LEFT);
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelData.setBounds(20, 160, 100, 20);
		panel.add(labelData);
		
		String[] tipoFatura = { "Particular", "Convênio", "Cortesia" };
		JComboBox comboTipoFatura = new JComboBox(tipoFatura);
		comboTipoFatura.setBounds(10, 75, 120, 20);
		panel.add(comboTipoFatura);
		
		String[] formaPagamento = { "Dinheiro", "Cartão", "Cheque" };
		JComboBox comboFormaPagamento = new JComboBox(formaPagamento);
		comboFormaPagamento.setBounds(152, 75, 142, 20);
		panel.add(comboFormaPagamento);
		
		String[] tipoExame = { "Exame 1", "Exame 2", "Exame 3" };
		JComboBox comboTipoExame = new JComboBox(tipoExame);
		comboTipoExame.setBounds(10, 128, 284, 20);
		panel.add(comboTipoExame);
		
		UtilDateModel model = new UtilDateModel();
		//model.setDate(2014, 12, 02);
		Properties p = new Properties();
		p.put("text.today", "Hoje");
		p.put("text.month", "Mês");
		p.put("text.year", "Ano");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		datePicker.setBounds(15, 180, 200, 30);
		panel.add(datePicker);
		
		JLabel labelHora = new JLabel("Hora");
		labelHora.setHorizontalAlignment(SwingConstants.LEFT);
		labelHora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelHora.setBounds(237, 160, 50, 22);
		panel.add(labelHora);
		
		JTextField textHora = new JTextField();
		textHora.setColumns(10);
		textHora.setBounds(230, 184, 50, 20);
		panel.add(textHora);

		JLabel lblCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		lblCamposObrigatrios.setBounds(11, 216, 161, 14);
		panel.add(lblCamposObrigatrios);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(48, 252, 89, 23);
		btnLimpar.addActionListener(manipulador);
		panel.add(btnLimpar);

		JButton btnCadastrar = new JButton("Agendar");
		btnCadastrar.setBounds(173, 251, 89, 23);
		btnCadastrar.addActionListener(manipulador);
		panel.add(btnCadastrar);
		
	}
}
