package estaticos;

public class Calc {
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		if (b != 0) {
			return a / b;
		}else {
			System.out.println("Divisão inválida; denominador não pode ser 0");
			return Double.NaN;
		}
	}

}
