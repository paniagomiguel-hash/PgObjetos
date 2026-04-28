package factory;

//Interface que define o que toda Notificação deve fazer
public interface Notificacao {
	void enviar(String destinatario, String mensagem);
}
