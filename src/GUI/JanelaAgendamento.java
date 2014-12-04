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

@SuppressWarnings({ "serial", "unused" })

public class JanelaAgendamento extends JFrame {

	public static JFrame frameJanelaAgendamento;
	public static EventoCadastro manipulador;
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
	 * Create the frame.
	 */
	public JanelaAgendamento() {
		
		manipulador = new EventoCadastro();
		closer = new CloseWindows();

		setBounds(100, 100, 1000, 600);
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(300, 89, 400, 400);
		contentPanel.setLayout(null);
		setContentPane(contentPanel);

		lblAgendamentos = new JLabel("Agendamentos");
		lblAgendamentos.setBounds(135, 6, 130, 21);
		lblAgendamentos.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPanel.add(lblAgendamentos);

		btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(175, 244, 90, 35);
		btnAlterar.addActionListener(manipulador);
		contentPanel.add(btnAlterar);
		
		String[] stringAgendamentos = {"Agendamento 1", "Agendamento 2", "Agendamento 3", "Agendamento 4", "Agendamento 5", "Agendamento 6", "Agendamento 7", "Agendamento 8"};
		listaAgendamentos = new JList(stringAgendamentos);
	    listaAgendamentos.setVisibleRowCount(4);
	    listaAgendamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    listaAgendamentos.setBounds(48, 130, 262, -91);
	    listaAgendamentos.setVisible(true);
		//listaAgendamentos.setSelectedIndex(0);
	    System.out.println(listaAgendamentos.getSelectedValue());
	    //contentPanel.add(new JScrollPane(listaAgendamentos));
	    contentPanel.add(listaAgendamentos);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(286, 244, 90, 35);
		btnCancelar.addActionListener(manipulador);
		contentPanel.add(btnCancelar);
		
		lblNovoAgendamento = new JLabel("Novo agendamento");
		lblNovoAgendamento.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNovoAgendamento.setBounds(24, 308, 152, 21);
		contentPanel.add(lblNovoAgendamento);
		
		btnExame = new JButton("Novo Exame");
		btnExame.setBounds(24, 341, 110, 35);
		btnExame.addActionListener(manipulador);
		contentPanel.add(btnExame);
		
		btnConsulta = new JButton("Nova Consulta");
		btnConsulta.setBounds(155, 341, 110, 35);
		btnConsulta.addActionListener(manipulador);
		contentPanel.add(btnConsulta);
	
		addWindowListener(closer);
	}
}
