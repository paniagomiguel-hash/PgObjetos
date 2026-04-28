package strategy;

import java.util.Comparator;
import java.util.List;

//Estratégia 3: ordenar por nota (da menor para a maior)
public class OrdenarPorNota implements EstrategiaOrdenacao {

public void ordenar(List<Produto> produtos) {
produtos.sort(Comparator.comparing(Produto::getNota));
System.out.println("Ordenado por nota");
}
}
