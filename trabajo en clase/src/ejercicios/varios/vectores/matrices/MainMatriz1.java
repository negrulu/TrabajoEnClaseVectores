package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare una matriz A[3,4] y desarrolle un programa que vaya solicitando cada una de sus posiciones
		
		Scanner lector = new Scanner(System.in);
		char A[][] = new char [3][4];
		
		for(int fila=0; fila<3; fila++){
			for (int columna=0; columna<4; columna++) {
				System.out.println("ingrese valor de la fila "+fila+" y de la columna "+columna);
				//el usuario digita el valor por teclado y el programa lo lee
				char n=lector.next().charAt(0);
				A[fila][columna]=n;
			}
		}
		for(int fila=0; fila<3; fila++){
			for (int columna=0; columna<4; columna++) {
				System.out.println("el valor de la fila es "+fila+" y de la columna es "+columna+" es "+A[fila][columna]);
			}
		}
	}

}
