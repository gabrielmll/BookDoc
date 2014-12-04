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

public class JanelaExame extends JFrame {
	
	public static JFrame frameJanelaExame;
	public static EventoExame manipulador;
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
					JanelaExame frameJanelaExame = new JanelaExame();
					JanelaExame.frameJanelaExame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaExame() {
		initialize();
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameJanelaExame = new JFrame();
		frameJanelaExame.setBounds(100, 100, 400, 400);
		frameJanelaExame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameJanelaExame.getContentPane().setLayout(null);
		
		frameJanelaExame.addWindowListener(new CloseWindows());

		telaExame();
	}

	private void telaExame() {

		manipulador = new EventoExame();

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 400, 400);
		contentPanel.setLayout(null);
		frameJanelaExame.getContentPane().add(contentPanel);
		
		labelCadastro = new JLabel("Agendar Exame");
		labelCadastro.setBounds(131, 5, 138, 20);
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
		
		labelExame = new JLabel("Exame");
		labelExame.setHorizontalAlignment(SwingConstants.LEFT);
		labelExame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelExame.setBounds(25, 95, 50, 20);
		contentPanel.add(labelExame);

		labelData = new JLabel("Escolha uma data e hora");
		labelData.setHorizontalAlignment(SwingConstants.LEFT);
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelData.setBounds(25, 150, 140, 20);
		contentPanel.add(labelData);
		
		String[] tipoFatura = { "Particular", "Conv�nio", "Cortesia" };
		JComboBox comboTipoFatura = new JComboBox(tipoFatura);
		comboTipoFatura.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboTipoFatura.setBounds(15, 60, 150, 20);
		contentPanel.add(comboTipoFatura);
		
		String[] formaPagamento = { "Dinheiro", "Cart‹o", "Cheque" };
		JComboBox comboFormaPagamento = new JComboBox(formaPagamento);
		comboFormaPagamento.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboFormaPagamento.setBounds(235, 60, 150, 20);
		contentPanel.add(comboFormaPagamento);
		
		String[] tipoExame = { "Raio X", "Ultrasom", "Resson‰ncia MagnŽtica" };
		JComboBox comboTipoExame = new JComboBox(tipoExame);
		comboTipoExame.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboTipoExame.setBounds(15, 115, 362, 20);
		contentPanel.add(comboTipoExame);
		
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
	}
}
