package aula02;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
		// this se refere a variavel da classe, a outra se refere ao parametro
	}
	
	
	
}
