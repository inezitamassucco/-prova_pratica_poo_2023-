import java.util.List;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	private Character condutor;
	private Character embriagado;
	
	
	
	public Pessoa() {

	}

	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		setSexo(JOptionPane.showInputDialog("Sexo (M/F)").toUpperCase().charAt(0));
		setCondutor(JOptionPane.showInputDialog("Condutor? (sim/não)").toUpperCase().charAt(0));
		if (getCondutor().equals('S')) {
			setEmbriagado(JOptionPane.showInputDialog("Embriagado? (sim/não)").toUpperCase().charAt(0));
		}
	}
	
	
	
	public String listaCondutor (List<Pessoa> pessoas) {
		String dados = "";			
				for (Pessoa p: pessoas) {
					if(p.getCondutor().equals('S') && p.getEmbriagado().equals('S')) {					
					dados+= p.toString();
				}
		}
		return dados ;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " - " + getIdade() + " anos - " + getSexo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Character getCondutor() {
		return condutor;
	}

	public void setCondutor(char condutor) {
		this.condutor = condutor;
	}

	public Character getEmbriagado() {
		return embriagado;
	}

	public void setEmbriagado(char embriagado) {
		this.embriagado = embriagado;
	}

}
