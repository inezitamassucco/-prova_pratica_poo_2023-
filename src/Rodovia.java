import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Rodovia {
	
	private Acidente acidente;
	private int siglaNumero;
	private String siglaEstado;
	private String periculosidade;

	List<Acidente> acidentes = new ArrayList<>();
	
	public Rodovia() {

	}

	public Rodovia(int siglaNumero, String siglaEstado, String periculosidade) {
		this.siglaNumero = siglaNumero;
		this.siglaEstado = siglaEstado;
		this.periculosidade = periculosidade;
	}

	public void cadastra() {
		setSiglaNumero(Integer.parseInt(JOptionPane.showInputDialog("Número:")));
		setSiglaEstado(JOptionPane.showInputDialog("Sigla do estado:").toUpperCase());
		setPericulosidade(JOptionPane.showInputDialog("Nível de periculosidade (alto, medio, baixo):").toUpperCase());
	}

	public int pAlto(List<Rodovia> rodovias) {
		int totalA = 0;
		if (getPericulosidade().equals("ALTO")) {
			totalA++;
		}
		return totalA;
	}

	public int pMedio(List<Rodovia> rodovias) {
		int totalM = 0;
		if (getPericulosidade().equals("MEDIO")) {
			totalM++;
		}
		return totalM;
	}

	public int pBaixo(List<Rodovia> rodovias) {
		int totalB = 0;
		if (getPericulosidade().equals("BAIXO")) {
			totalB++;
		}
		return totalB;
	}

	
		

	@Override
	public String toString() {
		return "BR" + "-" + getSiglaNumero() + "/" + getSiglaEstado() + " - " + getPericulosidade();
	}

	public int getSiglaNumero() {
		return siglaNumero;
	}

	public void setSiglaNumero(int siglaNumero) {
		this.siglaNumero = siglaNumero;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getPericulosidade() {
		return periculosidade;
	}

	public void setPericulosidade(String periculosidade) {
		this.periculosidade = periculosidade;
	}

	public Acidente getAcidente() {
		return acidente;
	}

	public void setAcidente(Acidente acidente) {
		this.acidente = acidente;
	}

}
