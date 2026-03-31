package estaticos;

public class Exemplo {

	public static void main(String[] args) {
		
		Pagavel[] p = new Pagavel[4];
		p[0] = new Funcionario("Gustavo", 1000);
		p[1] = new Fatura (300);
		p[2] = new Fatura(2000);
		p[3] = new Funcionario("João", 1500);
		
		for (int i = 0; i < p.length; i++) {
			double pagto = p[i].gerarPagamento();
			System.out.println(pagto);
		}
	}
}
