package tarea.interfaces.biblioteca;
import java.util.Scanner;
public class BibliotecaUCE implements BibliotecaInterfaz{
	Scanner entrada = new Scanner(System.in);
	@Override
	public void pedirIdentificacion(String identificacion) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a la biblioteca de la UCE");
		String nombreApellido, cedula;
		System.out.println("Por favor ingrese sus datos");
		System.out.println("Nombre y apellido: ");
		nombreApellido = entrada.nextLine();
		System.out.println("Cedula: ");
		cedula = entrada.nextLine();
		System.out.println("Bienvenido "+nombreApellido);
		System.out.println("Recuerde que su Token de identificacion es: "+identificacion);
	}

	@Override
	public void librosNoDisponibles(String librosNoDisponibles) {
		// TODO Auto-generated method stub
		System.out.println("De momento, no tenemos estos libros en nuestra disposicion: ");
		System.out.println(librosNoDisponibles);
		System.out.println("Asi que no puede reservar esos libros hasta nuevo aviso");
	}

	@Override
	public void reservaDeLibro(int libroReservado) {
		// TODO Auto-generated method stub
		String respuesta;
		System.out.println("¿Usted quiere reservar este libro?");
		System.out.println("Y/N");
		respuesta = entrada.nextLine();
			if (respuesta == "Y") {
				System.out.println("Este libro esta reservado para usted");
			}else if (respuesta == "N"){
				System.out.println("Libro aun disponible para reservacion");
			}
	}

	@Override
	public void citaParaRetirarLibro(String fechaParaRetirar) {
		// TODO Auto-generated method stub
		System.out.println("Su fecha para retirar su libro reservado es: "+fechaParaRetirar);
	}

	@Override
	public void fechaLimiteADejarLibro(String fechaLimite) {
		// TODO Auto-generated method stub
		System.out.println("Luego de recibir su libro reservado");
		System.out.println("Usted tiene hasta "+fechaLimite+" para devolvernos el libro");
		System.out.println("Gracias por usar la biblioteca de la universidad");
	}

}
