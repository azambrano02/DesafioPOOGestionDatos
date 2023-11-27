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
	public boolean estudianteExiste(String rut){
		
	}
}
