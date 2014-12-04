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

	public static JFrame frame;
	public static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAgendamento janelaAgendamento = new JanelaAgendamento();
					JanelaAgendamento.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		telaAgendamento();
	}

	/**
	 * Create the frame.
	 */
	public void telaAgendamento() {
		EventoCadastro manipulador = new EventoCadastro();
		CloseWindows closer = new CloseWindows();

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 89, 400, 400);
		panel.setLayout(null);
		frame.getContentPane().add(panel);


		JLabel lblAgendamentos = new JLabel("Agendamentos");
		lblAgendamentos.setBounds(135, 6, 130, 21);
		lblAgendamentos.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		panel.add(lblAgendamentos);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(175, 244, 90, 35);
		btnAlterar.addActionListener(manipulador);
		panel.add(btnAlterar);
		
		String[] stringAgendamentos = {"Agendamento 1", "Agendamento 2", "Agendamento 3", "Agendamento 4", "Agendamento 5", "Agendamento 6", "Agendamento 7", "Agendamento 8"};
		JList listaAgendamentos = new JList(stringAgendamentos);
	    listaAgendamentos.setVisibleRowCount(4);
	    listaAgendamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    listaAgendamentos.setBounds(48, 130, 262, -91);
	    listaAgendamentos.setVisible(true);
		//listaAgendamentos.setSelectedIndex(0);
	    System.out.println(listaAgendamentos.getSelectedValue());
	    panel.add(new JScrollPane(listaAgendamentos));
		panel.add(listaAgendamentos);

		JButton btnCadastrar = new JButton("Cancelar");
		btnCadastrar.setBounds(286, 244, 90, 35);
		btnCadastrar.addActionListener(manipulador);
		panel.add(btnCadastrar);
		
		JButton btnConsulta = new JButton("Nova Consulta");
		btnConsulta.setBounds(155, 341, 110, 35);
		btnConsulta.addActionListener(manipulador);
		
		JLabel lblNovoAgendamento = new JLabel("Novo agendamento");
		lblNovoAgendamento.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNovoAgendamento.setBounds(24, 308, 152, 21);
		panel.add(lblNovoAgendamento);
		panel.add(btnConsulta);

		JButton btnExame = new JButton("Novo Exame");
		btnExame.setBounds(24, 341, 110, 35);
		btnExame.addActionListener(manipulador);
		panel.add(btnExame);
	
		addWindowListener(closer);
	}
}
