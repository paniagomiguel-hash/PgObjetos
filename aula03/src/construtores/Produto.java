package construtores;

public class Produto {

	//atributos
	private double preco;
	private String nome;
	
	
	//construtores
	public Produto() {
		System.out.println("Construtor padrão");
		nome = "Desconhecido";
		preco = 0.0;
	}
	
	public Produto(String nome, double preco) {
		System.out.println("Construtor com argumentos");
		this.nome = nome;
		this.preco = preco;
	}
	
	//métodos
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

