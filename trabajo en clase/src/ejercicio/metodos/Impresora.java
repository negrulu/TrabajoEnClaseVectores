//1. Declaracion del paquete
package ejercicio.metodos;
//2. Declaracion de importaciones

//3. Comentarios
//Clase que se encarga de hacer una impresion en formatos A4

//4. Declaracion de la clase
public class Impresora {
	
	//5. Constantes
	//6. Variables
	public String color;
	
	//7. Constructor
	public Impresora(){
	}
	
	//8. Metodos
	public void imprimir(String datosAimprimir, int letra) {
		System.out.println("Logo UCE");
		System.out.println("*************");
		System.out.println(datosAimprimir);
		System.out.println("*************");
		System.out.println("Pie de firma");
		
	}
}
