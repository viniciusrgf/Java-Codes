package school.cesar.poo.av1.ex2.dispositivo;

import java.util.Iterator;
import java.util.Set;

public class RepositorioDispositivoImpl implements RepositorioDispositivo {
private Set<Dispositivo> armazenamento;
	public void cadastrarDispositivo(Dispositivo dispositivo) throws DispositivoException {
		Dispositivo.add(dispositivo);
		
	}

	public void descadastrarDispositivo(Dispositivo dispositivo) throws DispositivoException {
		Dispositivo busca = new Dispositivo("", dispositivo);
		if (this.armazenamento.contains(busca)) {
			Iterator<Dispositivo> it = this.armazenamento.iterator();
			while (it.hasNext()) {
				Dispositivo elemento = it.next();
				if (elemento.equals(busca)) {
					it.remove();
					
				}
			}
                }
                        
		
	}

	public void recuperarDispositivo(String macAddress) throws DispositivoException {
		Dispositivo busca = new Dispositivo("", macAddress);
		if (this.armazenamento.contains(busca)) {
			Iterator<Dispositivo> it = this.armazenamento.iterator();
			while (it.hasNext()) {
				Dispositivo elemento = it.next();
				if (elemento.equals(busca))
					

		
	}

}
