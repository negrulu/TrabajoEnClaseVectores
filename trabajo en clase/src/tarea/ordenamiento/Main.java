package tarea.ordenamiento;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado daniel = new Empleado();
		daniel.setNombre("Daniel");
		daniel.setApellido("Torres");
		daniel.setEdad(19);
		daniel.setSalario(500);
		
		Empleado cristina = new Empleado();
		cristina.setNombre("Cristina");
		cristina.setApellido("Alba");
		cristina.setEdad(20);
		cristina.setSalario(400);
		
		Empleado michael = new Empleado();
		michael.setNombre("Michael");
		michael.setApellido("Alvarado");
		michael.setEdad(21);
		michael.setSalario(550);
		
		Empleado gladys = new Empleado();
		gladys.setNombre("Gladys");
		gladys.setApellido("Fernandez");
		gladys.setEdad(23);
		gladys.setSalario(800);
		
		Empleado amanda = new Empleado();
		amanda.setNombre("Amanda");
		amanda.setApellido("Rodriguez");
		amanda.setEdad(25);
		amanda.setSalario(900);
		
		Empleado patricio = new Empleado();
		patricio.setNombre("Patricio");
		patricio.setApellido("Perez");
		patricio.setEdad(20);
		patricio.setSalario(300);
		
		Empleado matias = new Empleado();
		matias.setNombre("Matias");
		matias.setApellido("Carrion");
		matias.setEdad(24);
		matias.setSalario(600);
		
		Empleado oscar = new Empleado();
		oscar.setNombre("Oscar");
		oscar.setApellido("Salazar");
		oscar.setEdad(28);
		oscar.setSalario(950);
		
		Empleado bruno = new Empleado();
		bruno.setNombre("Bruno");
		bruno.setApellido("Tejera");
		bruno.setEdad(26);
		bruno.setSalario(750);
		
		Empleado valentina = new Empleado();
		valentina.setNombre("Valentina");
		valentina.setApellido("Soto");
		valentina.setEdad(30);
		valentina.setSalario(1250);
		
		Empleado salariosEmpleados[] = new Empleado[10];
		salariosEmpleados[0]=daniel;
		salariosEmpleados[1]=cristina;
		salariosEmpleados[2]=michael;
		salariosEmpleados[3]=gladys;
		salariosEmpleados[4]=amanda;
		salariosEmpleados[5]=patricio;
		salariosEmpleados[6]=matias;
		salariosEmpleados[7]=oscar;
		salariosEmpleados[8]=bruno;
		salariosEmpleados[9]=valentina;
		
		System.out.println("Empleados antes de ordenar");
		System.out.println(Arrays.toString(salariosEmpleados));

		Arrays.sort(salariosEmpleados);
		System.out.println("Empleados despues de ordenar");
		System.out.println(Arrays.toString(salariosEmpleados));
	}

}
