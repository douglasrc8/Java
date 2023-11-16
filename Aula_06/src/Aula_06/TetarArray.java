package Aula_06;

import java.util.ArrayList;
import java.util.Collections;

public class TetarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		// mostra na tela todas as notas inseridas
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		// Mostra uma determinada nota existente na lista (m�todo contains)
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		// Modificar um valor (indice, novoValor)
		notas.set(1, 6.0d);
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		notas.remove(1); // remove o elemento do �ndice informado
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		// Checa se a lista est� vazia
		System.out.println("\nA lista est� vazia? " + notas.isEmpty());
		
		// Mostra o tamanho da lista
		System.out.println("\nTamanho da lista (n�mero de elementos): " + notas.size());
		
		// Exibe o maior valor da lista
		System.out.println("\nMaior elemento da lista: " + Collections.max(notas));
		
		// Exibe o menor valor da lista
		System.out.println("\nMaior elemento da lista: " + Collections.min(notas));
				
		// Limpa a lista
		// notas.clear();
		// System.out.println("\nA lista est� vazia: " + notas.toString());
		
		System.out.println(("Posi��o do elemento 7.0: " + notas.indexOf(7.0)));
		System.out.println("Elemento na posi��o 0: " + notas.get(0));
		
		notas.forEach(System.out::println); // forma simplificada de fazer o forEach (el : els)
	}

}
