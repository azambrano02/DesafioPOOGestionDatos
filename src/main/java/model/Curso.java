package model;

import java.util.ArrayList;
import java.util.List;

import model.Estudiante;

public class Curso {
	private String letraCurso;
	private List<Estudiante> estudiantes;

	public String getLetraCurso() {
		return this.letraCurso;
	}

	public void setLetraCurso(String letraCurso) {
		this.letraCurso = letraCurso;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Curso(String letraCurso) {
		this.letraCurso = letraCurso;
		this.estudiantes = new ArrayList<>();
	}

	public void agregarEstudiante(Estudiante estudiante) {
		if (!estudianteExiste(estudiante)) {
			this.estudiantes.add(estudiante);
		}
	}
	public boolean estudianteExiste(Estudiante estudiante){
		for(Estudiante e : this.estudiantes){
			if(estudiante.getRut().equals(e.getRut())){
				System.out.println("El estudiante se encuentra en el curso");
				return true;
			}
		}return false;
	}
	public Estudiante buscarEstudiante(String rut) {
		for(Estudiante estudiante : this.estudiantes){
			if(estudiante.getRut().equals(rut)){
				return estudiante;
			}
		}
		return null;
	}

	public void mostrarEstudiantes(List<Estudiante> estudiantes) {
		throw new UnsupportedOperationException();
	}
	public void eliminarEstudiante(Estudiante estudiante) {
		throw new UnsupportedOperationException();
	}
}
