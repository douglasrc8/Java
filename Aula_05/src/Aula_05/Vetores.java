package Aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] pessoas = {"Luiza", "Gercidio", "Rafael", "Tati", "Vinicius", "Samara"};
		float[] notas = new float[5];
		
		for(int indice = 0; indice < 6; indice ++) //sem { } pq tem apenas um comando/a��o
		System.out.println("Posi��o  " + (indice + 1) + " = " + pessoas[indice]); //(indice + 1) para printar o 1 como posi��o inicial
	
		System.out.println("\n");
		
		//for(int indice = 0; indice < pessoas.length; indice ++) { //escopo principal, para rodar a pt inferior colocar como - //
		//	System.out.println("Posi��o  " + indice + " = ");
		//	notas[indice] = leia.nextFloat();	
		
	//}
		
	for(int indice = 0; indice < notas.length; indice ++) // nomeVetor.length para mostrar apenas o que esta dentro do tamanho do vetor
		System.out.println("Posi��o" + indice + " = " + notas[indice]);
	
		Arrays.sort(pessoas); //ordena conforme a condi��o declarada
		for(int indice = pessoas.length - 1; indice >= 0 ; indice --) //ordem crescente, o inverso +1, ++, = 0, realiza a ordem crescente
			System.out.println("Posi��o  [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("Localize o elemento da posi��o 02: " + Arrays.binarySearch(pessoas, "Luiza"));  //procurar a posi��o do elemento no vetor
	
		for(int indice = 0; indice < pessoas.length; indice ++) {
			if(pessoas[indice].equalsIgnoreCase("Luiza"))
				System.out.println("\nLuiza esta na posi��o: " + indice);
		}
		for(String pessoa : pessoas) {
			System.out.println(pessoa); //simplifica��o do loop for, s� funciona com vetores,matrizes etc
		}
	}
	

}
