package Aula_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade_02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numero = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.print("Os numeros da lista s�o: (2, 5, 1, 3, 4, 9, 7, 8, 10, 6) \n");
		
		
		// Leitura de dados
		System.out.print("\nDigite o n�mero que voc� deseja encontrar: ");
		int numFind = leia.nextInt();
		
		// Localiza��o do n�mero
		if(numero.indexOf(numFind) != -1) {
			System.out.printf("O n�mero %d est� localizado na posi��o: %d", numFind, numero.indexOf(numFind));
		} else {
			System.out.printf("O n�mero %d n�o foi encontrado!", numFind);
		}
	}

}
