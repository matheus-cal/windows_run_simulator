package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.RunController;
import controller.SearchController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoArquivo;
	private JButton botaoOK;
	private JButton botaoProcurar = new JButton("Procurar");
	private JButton botaoCancelar = new JButton("Cancelar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setResizable(false);				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void Main() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Insira o caminho do Execut\u00E1vel ou clique em Procurar");
		lblNewLabel.setBounds(168, 54, 321, 23);
		contentPane.add(lblNewLabel);

		textoArquivo = new JTextField();
		textoArquivo.setBounds(152, 117, 356, 20);
		contentPane.add(textoArquivo);
		textoArquivo.setColumns(10);

		JButton botaoOK = new JButton("OK");
		botaoOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoOK.setBounds(285, 271, 89, 23);
		contentPane.add(botaoOK);

		JButton botaoProcurar = new JButton("Procurar");
		botaoProcurar.setBounds(372, 190, 89, 23);
		contentPane.add(botaoProcurar);


		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoCancelar.setBounds(198, 190, 89, 23);
		contentPane.add(botaoCancelar);

		RunController run = new RunController(textoArquivo);
		SearchController search= new SearchController(textoArquivo);

		botaoProcurar.addActionListener(search);
		botaoOK.addActionListener(run);
	}
}