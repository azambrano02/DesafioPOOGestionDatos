package model;

public class Estudiante {
	private String nombre;
	private String email;
	private String rut;
	private Curso curso;

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
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Estudiante(String nombre, String email, String rut, Curso curso) {
		this.nombre = nombre;
		this.email = email;
		this.rut = rut;
		this.curso = curso;
	}
}