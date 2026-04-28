package strategy;

import java.util.List;

public class Catalogo {
	private List<Produto> produtos;
	private EstrategiaOrdenacao estrategia; // referência à estratégia atual

	public Catalogo(List<Produto> produtos) {
		this.produtos = produtos;
	}

	// Permite trocar a estratégia a qualquer momento
	public void setEstrategia(EstrategiaOrdenacao estrategia) {
		this.estrategia = estrategia;
	}

	public void exibir() {
	 if (estrategia != null) {
	 estrategia.ordenar(produtos); // delega para a estratégia
	 }
	 produtos.forEach(p ->
	 System.out.println(p.getNome() + " - R$ " + p.getPreco() + " - Nota: " + p.getNota())
	 );
	 }
}
