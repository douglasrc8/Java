package Aula_06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Stack<String> pilha = new Stack<String>();
		
		pilha.add("Aline"); // no lugar de add pode ser push tamb�m
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.add("Maria");
		
		pilha.pop(); // remove o �LTIMO elemento, AO CONTR�RIO DA FILA que remove o primeiro
		System.out.println(pilha);
		
		System.out.println("O elemento que est� no topo da pilha: " + pilha.peek()); // pr�ximo elemento a ser removido...
		
		System.out.println("A Aline est� na pilha? " + pilha.contains("Aline"));
	}

}
