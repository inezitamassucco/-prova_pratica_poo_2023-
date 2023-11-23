import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteMain {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Veiculo> veiculos = new ArrayList<>();
		List<Rodovia> rodovias = new ArrayList<>();
		List<Acidente> acidentes = new ArrayList<>();

		String menu = "1 - Cadastrar rodovia\n" + "2 - Cadastrar acidente\n"
				+ "3 - Listar acidentes com condutor embriagado\n"
				+ "4 - Mostrar a quantidade de acidentes para cada nível de periculosidade\n"
				+ "5 - Mostrar veículos de carga que se envolveram em acidentes\n"
				+ "6 - Rodovia em que ocorreram mais acidentes com bicicletas\n"
				+ "7 - Rodovia que possui mais acidentes com vítimas fatais\n"
				+ "8 - Quantos acidentes possuem veículos novos\n"
				+ "9 - Total de rodovias que registraram acidentes no carnaval \n"
				+ "10 - Sair";
		Pessoa p = new Pessoa();
		Rodovia r = new Rodovia();
		Veiculo v = new Veiculo();
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				r.cadastra();
				rodovias.add(r);
			}
			if (op == 2) {
				int qtdVeiculos = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantidade de veículos envolvidos"));
				for (int i = 0; i < qtdVeiculos; i++) {
					JOptionPane.showMessageDialog(null, "Cadastrar veículo " + (i + 1));
					
					v.cadastra();
					veiculos.add(v);
					int qtdPessoas = Integer
							.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas no veículo"));
					for (int j = 0; j < qtdPessoas; j++) {
						JOptionPane.showMessageDialog(null, "Cadastrar pessoa " + (j + 1));
						p.cadastra();
						pessoas.add(p);
					}
				}
				Acidente a = new Acidente();
				JOptionPane.showMessageDialog(null, "Informe a rodovia ->");
				r.cadastra();
				rodovias.add(r);
				a.cadastra();
				acidentes.add(a);
			}
			if (op == 3) {
				String dados = "";
				for (Pessoa pessoa : pessoas) {
					dados+= pessoa.listaCondutor(pessoas).toString();
				}
				JOptionPane.showMessageDialog(null, dados);
			}
			if (op == 4) {
			for (Rodovia rodovia : rodovias) {
				rodovia.pAlto(rodovias);
				rodovia.pMedio(rodovias);
				rodovia.pBaixo(rodovias);
				
			}
				JOptionPane.showMessageDialog(null, "Alto: " + r.pAlto(rodovias) + "\nMédio: " + r.pMedio(rodovias)
						+ "\nBaixo: " + r.pBaixo(rodovias));
			}
			if (op == 5) {
			JOptionPane.showMessageDialog(null, v.acidenteVCarga(veiculos));
			}
			if(op==6) {
				String dadosBicicleta = "Rodovias com acidentes envolvendo bicicletas:\n";
			    for (Acidente acidente : acidentes) {
			        if (acidente.envolveBicicletas()) {
			            dadosBicicleta += acidente.getRodovia().toString() + "\n";
			        }
			    }
			    JOptionPane.showMessageDialog(null, dadosBicicleta);
			
			}
			if(op==7) {
			
				
			}
			if(op==8) {
				String dadosVeiculoNovo = "Lista de veículos novos: \n";
				for (Veiculo veiculo : veiculos) {
					if(veiculo.totalVeiculosNovos() > 0) {
						dadosVeiculoNovo += veiculo.exibir() + "\n";
					}else {
						JOptionPane.showMessageDialog(null, "Não há veículos novos.");
					}
				}
				JOptionPane.showMessageDialog(null, dadosVeiculoNovo);
			}
			if(op==9) {
				String totalAcidentesCarnaval = "Lista de acidentes no carnaval: \n";
				for (Acidente acidente : acidentes) {
					if(acidente.acidentesCarnaval() > 0) {
						JOptionPane.showMessageDialog(null, totalAcidentesCarnaval + acidente.acidentesCarnaval());
					}
				}
			}
			
		} while (op != 10);

	}

}
