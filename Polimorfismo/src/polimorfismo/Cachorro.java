package polimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String raca) {
		super(raca);
		
	}

	public void emitirSom() {
		System.out.println("Cachorro da raça " + getRaca() + " latiu");
	}
	
	public void abanarORabo() {
		System.out.println("Cachorro da raça " + getRaca() + " está abanando o rabo");
	}
	
	
}
