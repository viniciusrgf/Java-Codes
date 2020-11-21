package school.cesar.poo.av1.ex1.cliente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClienteImpl implements RepositorioCliente {
    private Cliente[] armazenamento;
	private int ultimo = 0;
    public RepositorioClienteImpl() {
             
         this.armazenamento = new Cliente[2];
	}
	
	public void cadastrarCliente(Cliente cliente) {
            if (ultimo >= this.armazenamento.length) {
			Cliente[] temp = armazenamento;
			armazenamento = new Cliente[temp.length*2];
			System.arraycopy(temp, 0, armazenamento, 0, temp.length);
		}
		this.armazenamento[ultimo]=cliente;
		ultimo=ultimo+1;
		
	}

	public void descadastrarCliente(String cpf) {
		for (int i=0; i<ultimo;i++) {
			if (armazenamento[i] != null && armazenamento[i].getCpf().equals(cpf)) {
				Cliente cliente = armazenamento[i];
				armazenamento[i] = null;
			
			}
		}
		throw new RuntimeException("Nao ha cliente com o cpf " + cpf);
		
	}

	public Cliente recuperarCliente(String cpf) {
           for (int i=0; i<ultimo;i++) {
			if (armazenamento[i] != null && armazenamento[i].getCpf().equals(cpf))
				return armazenamento[i];
		}
		throw new RuntimeException("Nao ha cliente com o cpf " + cpf);
	}
	}


