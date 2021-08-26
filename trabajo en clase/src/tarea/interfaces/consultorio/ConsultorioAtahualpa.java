package tarea.interfaces.consultorio;

import java.util.Scanner;

public class ConsultorioAtahualpa implements ConsultorioInterfaz{

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void pedirDatos(String nombresApellidos, int cedula) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a nuestro consultorio 'Atahualpa'");
		System.out.println("Por favor ingrese su nombres y apellidos: ");
		nombresApellidos = entrada.nextLine();
		System.out.println("Ahora ingrese su cedula: ");
		cedula = entrada.nextInt();
	}

	@Override
	public void aisgnarDoctor(String nombreDoctor) {
		// TODO Auto-generated method stub
		System.out.println("El doctor que le atendera es "+nombreDoctor);
		
	}

	@Override
	public void sintomas(String sintomas) {
		// TODO Auto-generated method stub
		System.out.println("Por favor ingrese sus sintomas: ");
		sintomas = entrada.nextLine();
	}

	@Override
	public void fechaCita(String fecha) {
		// TODO Auto-generated method stub
		System.out.println("La fecha de su cita es "+fecha+", no olvide llegar a tiempo");
	}

	@Override
	public void diagnostico(String diagnostico) {
		// TODO Auto-generated method stub
		System.out.println("Luego de su cita medica");
		System.out.println("El doctor ha concluido que su diagnostico es "+diagnostico);
	}

}
