package observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Sujeito {
	private double preco;
	private List<Observador> observadores = new ArrayList<>();

	
	public void adicionarObservador(Observador o) {
		observadores.add(o);
	}

	
	public void removerObservador(Observador o) {
		observadores.remove(o);
	}

	
	public void notificarTodos(String evento, Object dado) {
		for (Observador o : observadores) {
			o.atualizar(evento, dado);
		}
	}

	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
		notificarTodos("PRECO_ALTERADO", novoPreco);
	}
}
