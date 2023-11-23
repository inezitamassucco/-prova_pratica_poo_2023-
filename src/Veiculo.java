import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Veiculo {
	
	private String tipoVeiculo;
	private int anoDeFabrica;
	private double quantidadeCarga;
	Pessoa pessoa;
	List<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastra() {
		setTipoVeiculo(JOptionPane.showInputDialog("Tipo de veículo (carro, moto, carga, bicicleta): ").toUpperCase());
		setAnoDeFabrica(Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação:")));	
		if (getTipoVeiculo().equals("CARGA")) {
			setQuantidadeCarga(Double.parseDouble(JOptionPane.showInputDialog("Informe a carga:")));
		}
		
	}
	public String acidenteVCarga(List<Veiculo> veiculos) {
		String dados = "";
			if (getTipoVeiculo().equals("CARGA")) {
				dados += toString();
			}	
		return dados;	
	}
	public int totalVeiculosNovos() {
		int totalVeiculosNovos = 0;
		if (getAnoDeFabrica() >= 2013) {
			totalVeiculosNovos++;
		}
		return totalVeiculosNovos;
            
	}
	 
	public String exibir() {
		return "Ano de fabricação: " + getAnoDeFabrica();
	}


	@Override
	public String toString() {
		return "Ano de fabricação: " + getAnoDeFabrica() + " - Quantidade de carga: " + getQuantidadeCarga() ;
	}
	
	public int getAnoDeFabrica() {
		return anoDeFabrica;
	}
	public void setAnoDeFabrica(int anoDeFabrica) {
		this.anoDeFabrica = anoDeFabrica;
	}
	public double getQuantidadeCarga() {
		return quantidadeCarga;
	}
	public void setQuantidadeCarga(double quantidadeCarga) {
		this.quantidadeCarga = quantidadeCarga;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

}
