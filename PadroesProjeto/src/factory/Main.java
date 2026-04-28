package factory;

public class Main {
	public static void main(String[] args) {
		// O código não sabe COMO o objeto é criado
		// Só sabe QUE tipo de notificação quer
		Notificacao n1 = NotificacaoFactory.criar("email");
		Notificacao n2 = NotificacaoFactory.criar("sms");
		Notificacao n3 = NotificacaoFactory.criar("push");
		n1.enviar("ana@email.com", "Seu pedido chegou!");
		n2.enviar("+55 47 99999-0000", "Código: 4821");
		n3.enviar("dispositivo-123", "Nova mensagem");
	}
}
