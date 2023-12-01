package model;

public class Estudiante {
	private String nombre;
	private String email;
	private String rut;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRut() {
		return this.rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Nombre: " +nombre+ "\n Email: " + email +"\n Rut: " + rut + "\n" ;
	}

	public Estudiante(String nombre, String email, String rut) {
		this.nombre = nombre;
		this.email = email;
		this.rut = rut;
	}
}