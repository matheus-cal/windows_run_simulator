package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.MainScreen;;


public class RunController implements ActionListener{
	private JPanel contentPane;
	private JTextField textoArquivo;
	
	public RunController(JTextField textoArquivo) {
		this.textoArquivo = textoArquivo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		validaArquivo();
	}
	
	
	
	public void validaArquivo() {
		try {
			MainScreen tela = new MainScreen();
			Runtime.getRuntime().exec(textoArquivo.getText().trim());
			boolean mostrando = tela.isDisplayable();
			if(mostrando) {
				tela.dispose();
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
		}
	}
}