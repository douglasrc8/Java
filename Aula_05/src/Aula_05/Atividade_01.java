package Aula_05;

import java.util.Scanner;

public class Atividade_01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorN = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		System.out.println("Digite o n�mero que voc� deseja encontrar: ");
		int valor = leia.nextInt();
		
		for(int i = 0; i < vetorN.length; i++) {
			if (valor == vetorN[i]) {
				encontrado = true;
				System.out.printf("O numero %d est� localizado na posi��o: %d", valor, i);
				break;
			}
		}
		
		if (!encontrado) {
			System.out.printf("O numero %d n�o foi encontrado!", valor);
		}
	}

}
