package aula02;

public class Principal {
	
	public static void main(String[] args) {
//		// instanciando 2 objetos carro
//		Carro carro1 = new Carro();
//		Carro carro2 = new Carro();
//		
//		// alterando valores
//		carro1.modelo = "Golf";
//		carro2.modelo = "Ram";
//		// chamando métodos
//		carro1.acelerar(40);
//		carro2.acelerar(50);
//		System.out.println("Velocidade do carro 1: " + carro1.modelo + ": " + carro1.velocidade);
//		System.out.println("Velocidade do carro 2: " + carro2.modelo + ": " + carro2.velocidade);
//		
//		// alterandp novamente a velocidade através do "freiar()"
//		carro1.frear(50);
//		System.out.println("Velocidade do carro 1: " + carro1.modelo + ": " + carro1.velocidade);
//	}
		
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Gustavo");
		conta.depositar(1000);
		
		System.out.println("Titualar: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
		boolean sucesso = conta.sacar(500);
		if (sucesso) {
			System.out.println("Saque feito com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Novo saldo: " + conta.getSaldo());
		
		
	}
}