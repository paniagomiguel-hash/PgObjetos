package strategy;

import java.util.Comparator;
import java.util.List;

//Estratégia 2: ordenar por nome alfabeticamente
public class OrdenarPorNome implements EstrategiaOrdenacao {
	
public void ordenar(List<Produto> produtos) {
produtos.sort(Comparator.comparing(Produto::getNome));
System.out.println("Ordenado por nome");
}
}

