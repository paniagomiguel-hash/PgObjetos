package singleton;

public class Logger {

	private static Logger instanciaUnica;

	private Logger() {
	}

	// Passo 3: método estático que retorna sempre a mesma instância
	public static Logger getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Logger(); // Cria apenas na primeira chamada
		}
		return instanciaUnica;
	}

	public void log(String mensagem) {
		System.out.println("[LOG]" + mensagem);
	}

}
