package polimorfismo;

public class Gato extends Animal{

	public Gato(String raca) {
		super(raca);
		
	}
	
	public void emitirSom() {
		System.out.println("Gato da raça " + getRaca() + " miou");
	}
	
	public void ronronar() {
		System.out.println("Gato da raça "+ getRaca() + " está ronronando");
	}
	
}
