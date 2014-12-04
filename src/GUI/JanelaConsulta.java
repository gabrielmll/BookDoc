package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class JanelaConsulta extends JFrame {
	
	public static JFrame frameJanelaConsulta;
	public static EventoConsulta manipulador;
	public static CloseWindows closer;
	public static JPanel contentPanel;
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
					JanelaConsulta frameJanelaConsulta = new JanelaConsulta();
					JanelaConsulta.frameJanelaConsulta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaConsulta() {
		initialize();
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameJanelaConsulta = new JFrame();
		frameJanelaConsulta.setBounds(100, 100, 400, 400);
		frameJanelaConsulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameJanelaConsulta.getContentPane().setLayout(null);

		telaConsulta();
	}

	private void telaConsulta() {

		manipulador = new EventoConsulta();
		closer = new CloseWindows();

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 400, 400);
		contentPanel.setLayout(null);
		frameJanelaConsulta.getContentPane().add(contentPanel);
		
		labelCadastro = new JLabel("Agendar Consulta");
		labelCadastro.setBounds(5, 6, 320, 36);
		contentPanel.add(labelCadastro);
		labelCadastro.setFont(new Font("Times New Roman", Font.BOLD, 33));

		labelTipo = new JLabel("Tipo");
		labelTipo.setBounds(20, 54, 50, 20);
		labelTipo.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(labelTipo);
		
		labelFormaPagamento = new JLabel("Forma de Pagamento");
		labelFormaPagamento.setBounds(162, 54, 132, 20);
		labelFormaPagamento.setHorizontalAlignment(SwingConstants.LEFT);
		labelFormaPagamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(labelFormaPagamento);
		
		labelExame = new JLabel("Exame");
		labelExame.setHorizontalAlignment(SwingConstants.LEFT);
		labelExame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelExame.setBounds(20, 107, 50, 20);
		contentPanel.add(labelExame);

		labelData = new JLabel("Escolha uma data");
		labelData.setHorizontalAlignment(SwingConstants.LEFT);
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelData.setBounds(20, 160, 100, 20);
		contentPanel.add(labelData);
		
		String[] tipoFatura = { "Particular", "Convênio", "Cortesia" };
		JComboBox comboTipoFatura = new JComboBox(tipoFatura);
		comboTipoFatura.setBounds(10, 75, 120, 20);
		contentPanel.add(comboTipoFatura);
		
		String[] formaPagamento = { "Dinheiro", "Cartão", "Cheque" };
		JComboBox comboFormaPagamento = new JComboBox(formaPagamento);
		comboFormaPagamento.setBounds(152, 75, 142, 20);
		contentPanel.add(comboFormaPagamento);
		
		String[] tipoExame = { "Exame 1", "Exame 2", "Exame 3" };
		JComboBox comboTipoExame = new JComboBox(tipoExame);
		comboTipoExame.setBounds(10, 128, 284, 20);
		contentPanel.add(comboTipoExame);
		
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
		contentPanel.add(labelHora);
		
		JTextField textHora = new JTextField();
		textHora.setColumns(10);
		textHora.setBounds(230, 184, 50, 20);
		contentPanel.add(textHora);

		JLabel labelCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		labelCamposObrigatrios.setBounds(11, 216, 161, 14);
		contentPanel.add(labelCamposObrigatrios);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds(48, 252, 89, 23);
		buttonLimpar.addActionListener(manipulador);
		contentPanel.add(buttonLimpar);

		JButton buttonCadastrar = new JButton("Agendar");
		buttonCadastrar.setBounds(173, 251, 89, 23);
		buttonCadastrar.addActionListener(manipulador);
		contentPanel.add(buttonCadastrar);
		
		addWindowListener(closer);
	}
}
