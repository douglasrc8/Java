package aula_03;

import java.util.Scanner;

public class Plano_de_saude {

	static Scanner leia = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		
		System.out.printf("Digite o seu nome:  ");
		nome = leia.nextLine();
		System.out.printf("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade > 0 && idade <= 10);{
			System.out.printf("%s o seu plano de saúde custará R$ 100,00 por mês", nome);	
		} else if(idade >= 11 && idade <= 29) { 
			System.out.printf("%s o seu plano de saúde custará R$ 200,00 por mês", nome);
	}

	}
}
