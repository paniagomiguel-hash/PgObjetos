package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		
		//Animal a = new Animal("indefinida");
		Gato g = new Gato("Siamês");
		Cachorro c = new Cachorro("SRD");
		Cachorro c2 = new Cachorro ("Bulldog");
		
		
		
		Animal[] animais = new Animal[] {g, c, c2};
		for (int i = 0; i < animais.length; i++) {
			animais[i].emitirSom();
			if (animais[i] instanceof Gato) {
				Gato gato = (Gato) animais[i]; //downcast
				gato.ronronar();
			} else if (animais[i] instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animais[i];
				cachorro.abanarORabo();
			}
			
//			if (animais[i] instanceof Gato) {
//				System.out.println("O animal acima é um gato");
//			} else if(animais[i] instanceof Cachorro) {
//				System.out.println("O animal acima é um cachorro");
//			}
			
		}
	}

}
