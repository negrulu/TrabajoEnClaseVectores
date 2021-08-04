package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare un vector x cuya longitud se solicite al usuario de tipo int
		//y contruya un programa que pida al usuario que ingrese los valores para cada posicion
		//y finalmente que se imprima los valores ingresados 

		Scanner lector = new Scanner(System.in);
		int p=0;
		int X[] = new int [p];
		System.out.println("ingrese valor de la longitud");
		p = lector.nextInt();
		
		for (int i=0; i<p; i++){
			System.out.println("ingrese valor de la posicion i: "+ i);
			int n=lector.nextInt();
			X[i]=n;
		}
		for (int i=0; i<p; i++){
			System.out.println("el valor de la posicion i es: "+ i);
			System.out.println(X[i]);
		}
		
	}

}
