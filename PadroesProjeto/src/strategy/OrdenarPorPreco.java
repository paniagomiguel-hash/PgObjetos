package strategy;

import java.util.Comparator;
import java.util.List;

//Estratégia 1: ordenar por preço (do menor para o maior)
public class OrdenarPorPreco implements EstrategiaOrdenacao {
public void ordenar(List<Produto> produtos) {
produtos.sort(Comparator.comparing(Produto::getPreco));
System.out.println("Ordenado por preço");
}
}

