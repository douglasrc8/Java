package salario_liquido;

import java.util.Scanner;

public class Salario_Liquido {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
float salario, adicional, hora_extra, desconto;

		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o adicional: ");
		adicional = leia.nextFloat();
		System.out.println("Digite a hora extra: ");
		hora_extra = leia.nextFloat();
		
		
		System.out.println("O salário bruto é: " + (salario+adicional+hora_extra));
		
		System.out.println("Digite desconto: ");
		desconto = leia.nextFloat();
		
		System.out.println("O salário liquído é: " + (salario+adicional+hora_extra-desconto));
		
		
		
	}

}
