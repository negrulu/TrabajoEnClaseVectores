package ejercicios.modificadores.acceso;

public class Paciente {
	public String nombre;
	public String apellido;
	protected String diagnostico;
	private String cedula;
	private String medicacion;
	protected String doctor;
	
	public void obtenerTurno() {
		System.out.println("el nombre es: "+nombre);
	}
	
	private void obtenerClaveCajero() {
		
	}
	
	protected void realizarDiagnostico() {
		
	}
}