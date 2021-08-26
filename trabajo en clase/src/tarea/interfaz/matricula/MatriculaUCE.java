package tarea.interfaz.matricula;
import java.util.Scanner;

public class MatriculaUCE implements MatriculaInterfaz{

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void identificacion(int cedula, String contraseña) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a nuestro sistema de matricula SIIU");
		System.out.println("Ingrese su cedula: ");
		cedula = entrada.nextInt();
		System.out.println("Ingrese su contraseña: ");
		contraseña = entrada.nextLine();
	}

	@Override
	public void semestreDelEstudiante(byte semestreEstudiante) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese en que semestre entrara: ");
		semestreEstudiante = entrada.nextByte();
		
	}
	
	@Override
	public void cuposDisponibles(int cupos) {
		// TODO Auto-generated method stub
		System.out.println("Actualmente solo existen un total de "+cupos+"para su semestre");
	}


	@Override
	public void fechaAMatricular(String fechaMatricula) {
		// TODO Auto-generated method stub
		System.out.println("La fecha para su matricula es "+fechaMatricula);
	}

	@Override
	public void materiasATomar(byte semestreEstudiante, String materia1, String materia2, 
			String materia3, String materia4, String materia5) {
		// TODO Auto-generated method stub
		System.out.println("Usted cumple con los requisitos para");
		System.out.println("matricularse en este semestre "+semestreEstudiante);
		
		System.out.println("Eliga en que materias quiere registrarse para este semestre");
		System.out.println("Desea matricularse en "+materia1+"?");
		System.out.println("Desea matricularse en "+materia2+"?");
		System.out.println("Desea matricularse en "+materia3+"?");
		System.out.println("Desea matricularse en "+materia4+"?");
		System.out.println("Desea matricularse en "+materia5+"?");
		
		System.out.println("Usted ha sido exitosamente matriculado");
	}

}
