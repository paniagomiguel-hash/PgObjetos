package observer;

public class Main {
	public static void main(String[] args) {
		PainelPreco painel1 = new PainelPreco();
		PainelPreco painel2 = new PainelPreco();
		Produto notebook = new Produto();
		notebook.adicionarObservador(painel1);
		notebook.adicionarObservador(painel2);
		// Uma mudança de preço notifica todos os painéis automaticamente
		notebook.setPreco(2199.00);
	}
}
