package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SearchController implements ActionListener {
	private JTextField textoArquivo;
	private String caminhoArquivo = "";

	
	public SearchController(JTextField textoArquivo) {
		this.textoArquivo = textoArquivo;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		procurarArquivo();
	}	
	
	public void procurarArquivo() {
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Executáveis", "exe"); 
		String diretorio = System.getProperty("user.home") + "/Desktop";
		File dir = new File(diretorio);
		
		JFileChooser escolha = new JFileChooser();
		escolha.setCurrentDirectory(dir); 
		escolha.setFileSelectionMode(JFileChooser.FILES_ONLY); 
		escolha.setAcceptAllFileFilterUsed(false); 
		escolha.addChoosableFileFilter(filter); 
		
		int retorno = escolha.showOpenDialog(null); 
		if(retorno == JFileChooser.APPROVE_OPTION) { 
			caminhoArquivo = escolha.getSelectedFile().getAbsolutePath(); 
			textoArquivo.setText(caminhoArquivo);
		}
		
	}

}