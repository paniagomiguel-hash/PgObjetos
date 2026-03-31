package Att1;

public class Principal {
	public static void main(String[] args) {
		
		Operavel[] obj = new Operavel[6];
		
		obj[0] = new Drone();
		obj[1] = new Drone();
		
		obj[2] = new Impressora3D();
		obj[3] = new Impressora3D();
		
		obj[4] = new Retroescavadeira();
		obj[5] = new Retroescavadeira();
		
		for (int i = 0; i < obj.length; i++) {
			obj[i].ligar();
			obj[i].desligar();
			obj[i].operar();
			
			
		}
	}

}
