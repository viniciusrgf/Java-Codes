package school.cesar.poo.av1.ex2.leitura;

import java.util.List;
import java.util.Set;

import school.cesar.poo.av1.ex2.dispositivo.Dispositivo;

public class RepositorioLeituraImpl implements RepositorioLeitura {
	private Set<Leitura> armazenamento;

	public void cadastrarLeitura(Leitura leitura) {
		this.armazenamento.add(leitura);
		
	}

	public List<Leitura> listarLeituras(Dispositivo dispositivo) {
		// TODO Auto-generated method stub
		return null;
	}

}
