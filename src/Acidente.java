import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Acidente {
	
	private Rodovia rodovia;
	private Veiculo veiculo;
	private Pessoa pessoa;
	private int quantidadeVitimasFatais;
	private int quantidadeFeridos;
	private int mes;
	
	List<Pessoa> pessoas = new ArrayList<>();
	List<Veiculo> veiculos = new ArrayList<>();
	List<Rodovia> rodovias = new ArrayList<>();
	
	public void cadastra() {
		
		setQuantidadeFeridos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de feridos")));
		setQuantidadeVitimasFatais(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de vítimas fatais")));
		setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês em que ocorreu o acidente (1 a 12)")));
	}
	
	
	public int acidentesCarnaval() {
		 int totalAcidentes = 0;
		        if (getMes() == 2) { 
		        	totalAcidentes++;
		        }
				return totalAcidentes;
		    }	
	
	public boolean envolveBicicletas() {
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getTipoVeiculo().equals("BICICLETA")) {
				return true;
			}
		}
		return false;
		
	}

	
	public int getQuantidadeVitimasFatais() {
		return quantidadeVitimasFatais;
	}

	public void setQuantidadeVitimasFatais(int quantidadeVitimasFatais) {
		this.quantidadeVitimasFatais = quantidadeVitimasFatais;
	}

	public int getQuantidadeFeridos() {
		return quantidadeFeridos;
	}

	public void setQuantidadeFeridos(int quantidadeFeridos) {
		this.quantidadeFeridos = quantidadeFeridos;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	public Rodovia getRodovia() {
		return rodovia;
	}
	
	public void setRodovia(Rodovia rodovia) {
		this.rodovia = rodovia;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
