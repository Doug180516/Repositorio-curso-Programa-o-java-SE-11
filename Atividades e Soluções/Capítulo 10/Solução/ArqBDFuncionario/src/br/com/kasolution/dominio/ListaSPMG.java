package br.com.kasolution.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListaSPMG implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private List<Funcionario> funcionariosSPMG;

	public ListaSPMG(List<Funcionario> funcionariosSPMG) {
		this.funcionariosSPMG = funcionariosSPMG;
	}

	public List<Funcionario> getFuncionariosSPMG() {
		return funcionariosSPMG;
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(LocalDateTime.now());
	}

	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();		
		LocalDateTime dataHoraArquivo = (LocalDateTime) ois.readObject();
		System.out.println("Data hora gravação do arquivo: " + data(dataHoraArquivo));
	}
	
	private String data(LocalDateTime data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy hh:mm:ss a");
		return dtf.format(data);
	}
	
}
