package polimorfismo;

public abstract class Animal {

	private String raca;
	
	//construtor
	public Animal(String raca) {
		this.raca = raca;
	}
	public void emitirSom() {
		System.out.println("Animal da raça " + getRaca() + " emitiu som");
		
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}

