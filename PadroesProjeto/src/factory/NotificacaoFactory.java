package factory;

public class NotificacaoFactory {
	// Este é o "factory method" — o método que cria objetos
	public static Notificacao criar(String tipo) {
		switch (tipo.toLowerCase()) {
		case "email":
			return new EmailNotificacao();
		case "sms":
			return new SmsNotificacao();
		case "push":
			return new PushNotificacao();
		default:
			throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
		}
	}
}
