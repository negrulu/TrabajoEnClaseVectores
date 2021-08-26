package tarea.interfaz.matricula;

public interface MatriculaInterfaz {
	
	public void identificacion(int cedula, String contraseña);
	
	public void cuposDisponibles(int cupos);
	
	public void semestreDelEstudiante(byte semestreEstudiante);
	
	public void fechaAMatricular(String fechaMatricula);
	
	public void materiasATomar(byte semestreEstudiante, String materia1, String materia2, 
			String materia3, String materia4, String materia5);
}
