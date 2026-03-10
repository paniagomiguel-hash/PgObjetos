package dispositivo;

public class mainDis {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		PCDesktop pcdesktop = new PCDesktop();
		
		pcdesktop.iniciar();
		celular.iniciar();
	}
}
