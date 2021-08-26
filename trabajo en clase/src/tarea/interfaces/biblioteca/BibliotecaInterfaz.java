package tarea.interfaces.biblioteca;

public interface BibliotecaInterfaz {
	
	public void pedirIdentificacion(String identificacion);
	
	public void librosNoDisponibles(String librosNoDisponibles);
	
	public void reservaDeLibro(int libroReservado);
	
	public void citaParaRetirarLibro(String fechaParaRetirar);
	
	public void fechaLimiteADejarLibro(String fechaLimite);
}
