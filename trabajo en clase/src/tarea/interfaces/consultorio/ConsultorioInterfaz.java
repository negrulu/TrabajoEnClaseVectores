package tarea.interfaces.consultorio;

public interface ConsultorioInterfaz {
	
	public void pedirDatos(String nombresApellidos, int cedula);
	
	public void aisgnarDoctor(String nombreDoctor);
	
	public void sintomas(String sintomas);
	
	public void fechaCita(String fecha);
	
	public void diagnostico(String diagnostico);
	
}
