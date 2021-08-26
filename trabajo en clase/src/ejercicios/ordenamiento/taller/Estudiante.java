package ejercicios.ordenamiento.taller;

public class Estudiante implements Comparable<Estudiante>{
	private String nombre;
	private String apellido;
	private int edad;
	private int numeroLista;
	
	//Cuando una clase no tiene constructor, por defecto tiene un
	//constructor sin parametros
	public Estudiante () {
		
	}
	
	public Estudiante (String nombre) {
		
	}
	
	public Estudiante (String nombre, String apellido) {
		
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroLista() {
		return numeroLista;
	}
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		if(this.edad>o.getEdad()){
			return 1;
		}else if(this.edad==o.getEdad()){
			return 0;
		}else{
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numeroLista="
				+ numeroLista + "]";
	}
	
	
	//Alt+shift+r   s
	//set y get
	
}