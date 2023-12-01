package vista;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Estudiante;
import model.Curso;
import dato.GestorDatos;
import java.util.List;

import static dato.GestorDatos.guardarEstudiantesEnArchivo;


public class Menu {
	public static void main(String[] args) {
		Menu menu = new Menu(new Curso("A"));
		menu.menu();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	private Curso curso;

	public Menu(Curso curso) {
		this.curso = curso;
	}

	public void menu() {
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			imprimirMenu();
			opcion = pedirEntrada();

			switch (opcion) {
				case 1:
					System.out.println("Ingrese nombre del estudiante");
					String nombre = entrada.next();
					System.out.println("Ingrese rut del estudiante");
					String rut = entrada.next();
					System.out.println("Ingrese email del estudiante");
					String email = entrada.next();
					Estudiante estudiante = new Estudiante(nombre, rut, email);
					curso.agregarEstudiante(estudiante);
					guardarEstudiantesEnArchivo(curso.getEstudiantes());
					break;
				case 2:
					System.out.println("Ingrese el rut del estudiante que desea buscar");
					curso.buscarEstudiante(entrada.nextLine());
					break;
				case 3:
					curso.mostrarEstudiantes(curso.getEstudiantes());
					break;
				case 4:
					System.out.println("Ingrese el rut del estudiante que desea elminar");
					curso.eliminarEstudiante(entrada.nextLine());
					guardarEstudiantesEnArchivo(curso.getEstudiantes());
					break;

				case 5:
					break;
			}

		}
		while (opcion != 5);
	}


	private int pedirEntrada() {
		Scanner entrada = new Scanner(System.in);
		try {
			int opcion = entrada.nextInt();
			if (opcion < 1 || opcion > 5) {
				System.out.println("Opcion invalida");
				return pedirEntrada();
			}
			return opcion;
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un numero entero");
			entrada.nextInt();
			return pedirEntrada();
		}
	}

	private void imprimirMenu() {
		System.out.println("1) Agregar Estudiante");
		System.out.println("2) Buscar Estudiante");
		System.out.println("3) Mostrar Estudiantes");
		System.out.println("4) Eliminar un Estudiante");
		System.out.println("5) Salir");
	}
}
