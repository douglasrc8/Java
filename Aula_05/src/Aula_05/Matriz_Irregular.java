package Aula_05;

import java.util.Scanner;

public class Matriz_Irregular {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double[][] matrizIrregular = {{1,2,3},{4,5,6}}; //irreg. 2x3
		
		for(int indiceI = 0; indiceI < matrizIrregular.length; indiceI ++ ) {
			for(int indiceJ = 0; indiceJ < matrizIrregular[indiceI].length; indiceJ ++ ) {
				System.out.println("Matriz{" + indiceI + "][" + indiceJ + "] = " + matrizIrregular[indiceI][indiceJ]);
			
			}
				
	}
		System.out.println("\n");
		
		for(double[] vetor : matrizIrregular) {
			for(double elemento : vetor) {
				System.out.println(elemento);
			}
		}
	}

}
