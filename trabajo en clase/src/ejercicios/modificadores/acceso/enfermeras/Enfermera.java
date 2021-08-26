package ejercicios.modificadores.acceso.enfermeras;
import ejercicios.modificadores.acceso.PacienteTerceraEdad;
public class Enfermera {
	
	public void darDeAlta() {
		PacienteTerceraEdad pepito = new PacienteTerceraEdad();
		pepito.examenProstata();
		pepito.nombre="";
		pepito.apellido="";
		pepito.realizarDiagnostico();
	}

}
