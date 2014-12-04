package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.WindowListener;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

@SuppressWarnings({ "serial", "unused" })

public class JanelaAgendamento extends JFrame {

	public static JFrame frameJanelaAgendamento;
	public static EventoAgendamento manipulador;
	public static CloseWindows closer;
	public static JPanel contentPanel;
	public static JLabel lblAgendamentos;
	public static JList listaAgendamentos;
	protected static JButton btnAlterar;
	protected static JButton btnCancelar;
	public static JLabel lblNovoAgendamento;
	protected static JButton btnExame;
	protected static JButton btnConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAgendamento frameJanelaAgendamento = new JanelaAgendamento();
					JanelaAgendamento.frameJanelaAgendamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	/**
	 * Create the application.
	 */
	public JanelaAgendamento() {
		initialize();
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameJanelaAgendamento = new JFrame();
		frameJanelaAgendamento.setBounds(100, 100, 400, 400);
		frameJanelaAgendamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameJanelaAgendamento.getContentPane().setLayout(null);

		telaAgendamento();
	}

	private void telaAgendamento() {		
		
		manipulador = new EventoAgendamento();
		closer = new CloseWindows();

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 400, 400);
		contentPanel.setLayout(null);
		frameJanelaAgendamento.getContentPane().add(contentPanel);

		lblAgendamentos = new JLabel("Agendamentos");
		lblAgendamentos.setBounds(135, 6, 130, 21);
		lblAgendamentos.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPanel.add(lblAgendamentos);

		btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(100, 132, 90, 30);
		btnAlterar.addActionListener(manipulador);
		contentPanel.add(btnAlterar);
		
		String[] stringAgendamentos = {"Agendamento 1", "Agendamento 2", "Agendamento 3", "Agendamento 4", "Agendamento 5", "Agendamento 6", "Agendamento 7", "Agendamento 8"};
		listaAgendamentos = new JList(stringAgendamentos);
		listaAgendamentos.setBorder(new LineBorder(new Color(0, 0, 0)));
	    listaAgendamentos.setVisibleRowCount(4);
	    listaAgendamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    listaAgendamentos.setBounds(25, 50, 350, 70);
		//listaAgendamentos.setSelectedIndex(0);
	    System.out.println(listaAgendamentos.getSelectedValue());
	    //contentPanel.add(new JScrollPane(listaAgendamentos));
	    contentPanel.add(listaAgendamentos);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(230, 132, 90, 30);
		btnCancelar.addActionListener(manipulador);
		contentPanel.add(btnCancelar);
		
		lblNovoAgendamento = new JLabel("Novo agendamento");
		lblNovoAgendamento.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNovoAgendamento.setBounds(124, 192, 152, 21);
		contentPanel.add(lblNovoAgendamento);
		
		btnExame = new JButton("Novo Exame");
		btnExame.setBounds(80, 234, 110, 35);
		btnExame.addActionListener(manipulador);
		contentPanel.add(btnExame);
		
		btnConsulta = new JButton("Nova Consulta");
		btnConsulta.setBounds(210, 234, 110, 35);
		btnConsulta.addActionListener(manipulador);
		contentPanel.add(btnConsulta);
	
		addWindowListener(closer);
	}
}
