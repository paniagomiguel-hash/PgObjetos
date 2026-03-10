package jogo;

public class jogo {

	public static void main(String[] args) {
		
		Personagem personagem = new Personagem();
		Arqueiro arqueiro = new Arqueiro();
		Mago mago = new Mago();
		Guerreiro guerreiro = new Guerreiro();
		
//		personagem.atacar();
//		arqueiro.atacar();
		
		Personagem[] personagens = new Personagem[4];
		personagens[0] = personagem;
		personagens[1] = arqueiro;
		personagens[2] = mago;
		personagens[3] = guerreiro;
		for (int i = 0; i < personagens.length; i++) {
			personagens[i].atacar("Mortal");
		}
	}
}
