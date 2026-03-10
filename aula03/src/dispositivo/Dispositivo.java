package dispositivo;

public class Dispositivo {

	private String modelo;
	
	public void iniciar() {
		System.out.println(modelo + "iniciou..");
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
									