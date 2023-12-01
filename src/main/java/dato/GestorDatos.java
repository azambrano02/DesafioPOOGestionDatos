package dato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Curso;
import model.Estudiante;
import vista.Menu;

public class GestorDatos {
	private static final String ARCHIVO_DATOS = "datos_estudiantes.csv";
	private static Curso cargarEstudiantesDesdeArchivo() {
		Curso curso = new Curso("A");

		try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_DATOS))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] datosEstudiante = linea.split(",");
				String nombre = datosEstudiante[0];
				String rut = datosEstudiante[1];
				String email = datosEstudiante[2];

				Estudiante estudiante = new Estudiante(nombre, rut, email);
				curso.agregarEstudiante(estudiante);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo de datos. Se creará uno nuevo al agregar estudiantes.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return curso;
	}

	public static void guardarEstudiantesEnArchivo(List<Estudiante> estudiantes) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_DATOS))) {
			for (Estudiante estudiante : estudiantes) {
				String linea = estudiante.getNombre() + "," + estudiante.getRut() + "," + estudiante.getEmail();
				bw.write(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}