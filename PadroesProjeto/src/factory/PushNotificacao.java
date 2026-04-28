package factory;

public class PushNotificacao implements Notificacao {
	@Override
	public void enviar(String destinatario, String mensagem) {
		System.out.println("Push para " + destinatario + ": " + mensagem);
	}
}
