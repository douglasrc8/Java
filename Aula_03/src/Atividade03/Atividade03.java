package Atividade03;

import java.util.Scanner;

public class Atividade03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade;
		String doador;
		boolean primeiraD;
		
		System.out.println("Digite o Nome do doador: ");
		doador = leia.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? Digite 1 para sim e 2 para não ");
		primeiraD = leia.nextBoolean();

	
		if(idade < 18 || idade > 69) {
			System.out.printf("não está apto");
		} else if((idade >= 60 && idade <= 69) && (primeiraD == true)) {
			System.out.printf("está apto");
		}
		
		System.out.printf("%s %s para doar sangue!", doador);
		
	}

}

