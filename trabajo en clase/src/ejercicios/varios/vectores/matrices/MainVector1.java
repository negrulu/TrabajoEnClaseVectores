package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector x de longitud [3] de tipo char y contruya un programa que pida al usuario que 
		//ingrese los valores para cada posicion
		//y finalmente que se imprima los valores ingresados
		
		Scanner lector = new Scanner(System.in);
		char X[] = new char [3];
		
		for (int i=0; i<3; i++){
			System.out.println("ingrese valor de la posicion i: "+ i);
			char n=lector.next().charAt(0);
			X[i]=n;
			
		}
		//recorriendo el vector de lleno
		for (int i=0; i<3; i++){
			System.out.println("el valor de la posicion i es: "+ i);
			System.out.println(X[i]);
		}
		
		//recorriendo el vector de forma ineficiente
		//System.out.println("el valor de la posicion 0 es");
		//System.out.println(X[0]);
		//System.out.println("el valor de la posicion 1 es");
		//System.out.println(X[1]);
		//System.out.println("el valor de la posicion 2 es");
		//System.out.println(X[2]);
	}

}
