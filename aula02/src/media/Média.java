package media;

import java.util.Scanner;

public class Média {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
float nota1,nota2,nota3,nota4;

		System.out.println("Digite a 1ª nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a 2ª nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a 3ª nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a 4ª nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("A soma das notas é: " + (nota1+nota2+nota3+nota4));
		System.out.printf("A média final de " + (nota1+nota2+nota3+nota4/4));
	
		
	}

}
