package Aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;		

public class Atividade_04 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numeros = new HashSet<Integer>(Set.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		// Leitura de dados
		System.out.println("Digite o n�mero que voc� deseja encontrar: ");
		int numFind = leia.nextInt();
				
		// Localiza��o do n�mero
		if (numeros.contains(numFind)) {
			System.out.printf("O n�mero %d foi encontrado!", numFind);
		} else {
			System.out.printf("O n�mero %d n�o foi encontrado!", numFind);
		}

	}

}
