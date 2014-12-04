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
	protected static JLabel labelEspecialidade;
	protected static JLabel labelMedico;
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
		labelCadastro.setBounds(122, 5, 155, 20);
		contentPanel.add(labelCadastro);
		labelCadastro.setFont(new Font("Lucida Grande", Font.PLAIN, 18));

		labelTipo = new JLabel("Tipo");
		labelTipo.setBounds(25, 40, 50, 20);
		labelTipo.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(labelTipo);
		
		labelFormaPagamento = new JLabel("Forma de Pagamento");
		labelFormaPagamento.setBounds(245, 40, 132, 20);
		labelFormaPagamento.setHorizontalAlignment(SwingConstants.LEFT);
		labelFormaPagamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(labelFormaPagamento);
		
		labelEspecialidade = new JLabel("Especialidade");
		labelEspecialidade.setHorizontalAlignment(SwingConstants.LEFT);
		labelEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelEspecialidade.setBounds(25, 95, 72, 20);
		contentPanel.add(labelEspecialidade);
		
		labelMedico = new JLabel("Médico");
		labelMedico.setHorizontalAlignment(SwingConstants.LEFT);
		labelMedico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelMedico.setBounds(25, 150, 50, 20);
		contentPanel.add(labelMedico);

		labelData = new JLabel("Escolha uma data e hora");
		labelData.setHorizontalAlignment(SwingConstants.LEFT);
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelData.setBounds(25, 200, 140, 20);
		contentPanel.add(labelData);
		
		String[] tipoFatura = { "Particular", "Convênio", "Cortesia" };
		JComboBox comboTipoFatura = new JComboBox(tipoFatura);
		comboTipoFatura.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboTipoFatura.setBounds(15, 60, 150, 20);
		contentPanel.add(comboTipoFatura);
		
		String[] formaPagamento = { "Dinheiro", "Cartão", "Cheque" };
		JComboBox comboFormaPagamento = new JComboBox(formaPagamento);
		comboFormaPagamento.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboFormaPagamento.setBounds(235, 60, 150, 20);
		contentPanel.add(comboFormaPagamento);
		
		String[] tipoEspecialidade = { "Pediatra", "Urologista", "Cardiologista" };
		JComboBox comboTipoEspecialidade = new JComboBox(tipoEspecialidade);
		comboTipoEspecialidade.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboTipoEspecialidade.setBounds(15, 115, 362, 20);
		contentPanel.add(comboTipoEspecialidade);
		
		String[] medico = { "Roberto Marinho", "Fernando Henrique", "Alexandre Kalil" };
		JComboBox comboMedico = new JComboBox(medico);
		comboMedico.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboMedico.setBounds(15, 170, 362, 20);
		contentPanel.add(comboMedico);
		
	    JFrame calendarFrame = new JFrame("Calendario");
	    calendarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = calendarFrame.getContentPane();
	    container.setLayout(new FlowLayout());
	    container.add(new Cal());
	    calendarFrame.pack();
	    calendarFrame.setVisible(true);

		JLabel labelCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		labelCamposObrigatrios.setBounds(119, 357, 161, 14);
		contentPanel.add(labelCamposObrigatrios);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(220, 313, 90, 35);
		buttonCancelar.addActionListener(manipulador);
		contentPanel.add(buttonCancelar);

		JButton buttonAgendar = new JButton("Agendar");
		buttonAgendar.setBounds(90, 312, 90, 35);
		buttonAgendar.addActionListener(manipulador);
		contentPanel.add(buttonAgendar);
		
		addWindowListener(closer);
	}
}
