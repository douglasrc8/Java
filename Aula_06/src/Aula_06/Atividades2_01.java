package Aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Atividades2_01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		String nome;
		int op = 9;
		
		do {
			System.out.println("\n*********************************************\n");
			System.out.println("	1 - Adicionar Cliente na Fila");
			System.out.println("	2 - Listar todos os Clientes");
			System.out.println("	3 - Retirar Cliente da Fila");
			System.out.println("	0 - Sair\n");
			System.out.println("*********************************************");
			System.out.print("Entre com a op��o desejada: ");
			op = leia.nextInt();
			switch(op) {
			case 1:
				System.out.print("Digite o nome: ");
				leia.skip("\\R");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: ");
				for(var s: fila) {
					System.out.println(s);
				}
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				if(!fila.isEmpty()) {
					System.out.println("\nLista de Clientes na Fila: ");
					for(var s: fila) {
						System.out.println(s);
					}
					break;
				}
				System.out.println("A Fila est� vazia!");
				break;
			case 3:
				if(!fila.isEmpty()) {
					fila.remove();
					System.out.println("\nFila: ");
					for(var s: fila) {
						System.out.println(s);
					}
					System.out.println("\nO cliente foi Chamado!");
					break;
				}
				System.out.println("\nA Fila est� vazia!");
				break;	
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOp��o Inv�lida");
				break;
			}
		
		} while (op!=0);
		
	}

}
