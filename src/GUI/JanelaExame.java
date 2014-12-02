package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;

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

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import Sistema.Listas;

import javax.swing.SpringLayout;

@SuppressWarnings({ "serial", "unused" })

public class JanelaExame extends JFrame {
	
	public static JPanel contentPane;
	protected static JPanel panel;
	protected static JLabel labelCadastro;
	protected static JLabel labelTipo;
	protected static JLabel labelFormaPagamento;
	protected static JLabel labelExame;
	protected static JLabel labelData;
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
		CloseWindows closer = new CloseWindows();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 320, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		labelCadastro = new JLabel("AGENDAR EXAME");
		labelCadastro.setBounds(5, 6, 320, 36);
		panel.add(labelCadastro);
		labelCadastro.setFont(new Font("Times New Roman", Font.BOLD, 33));

		labelTipo = new JLabel("Tipo");
		labelTipo.setBounds(20, 54, 50, 20);
		labelTipo.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelTipo);
		
		labelFormaPagamento = new JLabel("Forma de Pagamento");
		labelFormaPagamento.setBounds(162, 54, 132, 20);
		labelFormaPagamento.setHorizontalAlignment(SwingConstants.LEFT);
		labelFormaPagamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelFormaPagamento);
		
		labelExame = new JLabel("Exame");
		labelExame.setHorizontalAlignment(SwingConstants.LEFT);
		labelExame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelExame.setBounds(20, 107, 50, 20);
		panel.add(labelExame);

		labelData = new JLabel("Escolha uma data");
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
		
	    JFrame calendarFrame = new JFrame("Calendario");
	    calendarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = calendarFrame.getContentPane();
	    container.setLayout(new FlowLayout());
	    container.add(new Cal());
	    calendarFrame.pack();
	    calendarFrame.setVisible(true);
	    //this.add(calendarFrame);
		
		JLabel labelHora = new JLabel("Hora");
		labelHora.setHorizontalAlignment(SwingConstants.LEFT);
		labelHora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelHora.setBounds(237, 160, 50, 22);
		panel.add(labelHora);
		
		JTextField textHora = new JTextField();
		textHora.setColumns(10);
		textHora.setBounds(230, 184, 50, 20);
		panel.add(textHora);

		JLabel labelCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		labelCamposObrigatrios.setBounds(11, 216, 161, 14);
		panel.add(labelCamposObrigatrios);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds(48, 252, 89, 23);
		buttonLimpar.addActionListener(manipulador);
		panel.add(buttonLimpar);

		JButton buttonCadastrar = new JButton("Agendar");
		buttonCadastrar.setBounds(173, 251, 89, 23);
		buttonCadastrar.addActionListener(manipulador);
		panel.add(buttonCadastrar);
		
		addWindowListener(closer);
	}
}
