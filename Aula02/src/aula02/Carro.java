package aula02;

public class Carro {

	String marca;
	String modelo;
	int ano;
	double velocidade;
	
	void acelerar(double delta) {
		velocidade = velocidade + delta;
	}
	void frear (double delta) {
		if (velocidade - delta >= 0)
			velocidade = velocidade - delta;
		else 
			velocidade = 0;
	}
	
}
