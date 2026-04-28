package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	 List<Produto> lista = Arrays.asList(
	 new Produto("Notebook", 2500.0, 3.8),
	 new Produto("Mouse", 89.9, 4.8),
	 new Produto("Gabinete", 300.0, 4.2)
	 );
	 Catalogo catalogo = new Catalogo(lista);
	 // Ordena por preço
	 catalogo.setEstrategia(new OrdenarPorPreco());
	 catalogo.exibir();
	 // Troca para ordenação por nome
	 catalogo.setEstrategia(new OrdenarPorNome());
	 catalogo.exibir();
	 // Troca para ordenação por nota
	 catalogo.setEstrategia(new OrdenarPorNota());
	 catalogo.exibir();
	 }
	}
