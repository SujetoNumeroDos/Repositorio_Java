package co.edu.unbosque.model;

public class Huesped {
	private String nombreCompleto;
	private int edad;
	private String ciudadania;
	private int noPersonas;
	
	
	public Huesped() {	
	}
	public Huesped(String nombreCompleto, int edad, String ciudadania, int noPersonas) {
		
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		this.ciudadania = ciudadania;
		this.noPersonas = noPersonas;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudadania() {
		return ciudadania;
	}
	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
	}
	public int getNoPersonas() {
		return noPersonas;
	}
	public void setNoPersonas(int noPersonas) {
		this.noPersonas = noPersonas;
	}
	
}
