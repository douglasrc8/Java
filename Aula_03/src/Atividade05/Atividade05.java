package Atividade05;

import java.util.Scanner;

public class Atividade05 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int codigo, quantidade;
		double valor_total, valor;
		String produto;
		
		System.out.println("|1 | Cachorro Quente| R$10,00|\n"
				+"|2 | X-Salada       | R$15,00|\n"
				+"|3 | X-Bacon        | R$18,00|\n"
				+"|4 | Bauru          | R$12,00|\n"
				+"|5 | Refrigerante   | R$8,00 |\n"
				+"|6 | Suco de Laranja| R$13,00|\n \nCódigo do Produto:");
		
		codigo = leia.nextInt();
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
				

		switch(codigo) {
			case 1:
				valor = 10.00;
				produto = "Cachorro Quente";
				break;
			case 2:
				valor = 15.00;
				produto = "X-Salada";
				break;
			case 3:
				valor = 18.00;
				produto = "X-Bacon";
				break;
			case 4:
				valor = 12.00;
				produto = "Bauru";
				break;
			case 5:
				valor = 8.00;
				produto = "Refrigerante";
				break;
			case 6:
				valor = 13.00;
				produto = "Suco de laranja";
				break;
			default:
				valor = 0;
				produto = "Produto inválido";
		}
		
		valor_total = (quantidade*valor);
		System.out.println("\n");
		System.out.printf("Produto: %s\nValor total: R$ %.2f\n", produto,  valor_total);
		System.out.println("\n");
		
	}

}
