package jogo;

public class Personagem {
	
	//atributos
	private int vida;
	
	//metodos
	public void atacar() {
		System.out.println("Personagem atacou.");
	}

	public void atacar(String tipo) {
		System.out.println("Personagem executou ataque do tipo " + tipo);
	}
	
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	
	
}
