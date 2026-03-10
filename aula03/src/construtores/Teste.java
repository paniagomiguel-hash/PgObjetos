package construtores;

public class Teste {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Fulano", "123.456.789-00");
		
		System.out.println("Pessoa: " + p.getNome() + " " +p.getCpf());
		
		
		
		Funcionario f = new Funcionario("José", "333.333.333-33", 3000.0);
		System.out.println("Funcionario: " + f.getNome() + " " + f.getCpf() + " " + f.getSalario());
		
//		Produto p1 = new Produto();
//		Produto p2 = new Produto("pao", 5.0);
//		
//		System.out.println("Produto 1: " + p1.getNome() + " " + p1.getPreco());
//		System.out.println("Produto 2: " + p2.getNome() + " " + p2.getPreco());
	}

}
