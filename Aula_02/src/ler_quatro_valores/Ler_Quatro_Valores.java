package ler_quatro_valores;

import java.util.Scanner;

public class Ler_Quatro_Valores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float n1,n2,n3,n4, resultado;

		System.out.println("Digite o 1º número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o 4º número: ");
		n4 = leia.nextFloat();

		resultado = (n1 * n2) - (n3*n4);
	System.out.println("A diferença é: " + (resultado));
		
	}
	
}
