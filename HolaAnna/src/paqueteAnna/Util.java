package paqueteAnna;
//Clase para Anna
public class Util {
	private String cadena;//atributo
	//Constructor:
	public Util(String cadena){
		setCadena(cadena);
	}
	//métodos
	public void mostrar() {
		System.out.print(getCadena());
	}
	//Getters y Setters
	private String getCadena() {
		return cadena;
	}
	private void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	
}
