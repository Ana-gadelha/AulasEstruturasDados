package basico;

import java.util.Scanner;

public class MetodosMatematicos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite um numero: ");
		double num2 = entrada.nextDouble();
		//Opera��es matem�ticas
		System.out.println("Teto do valor fornecido: " + Math.ceil(num1));
		System.out.println("Piso do valor fornecido: " + Math.floor(num1));
		System.out.println("O Maior �: " + Math.max(num1, num2));
		System.out.println("O Menor �: " + Math.min(num1, num2));
		System.out.printf("A raiz quadrada de %g �: %g\n", num1, Math.sqrt(num1));
		System.out.printf("%g ^ %g = %g", num1, num2, Math.pow(num1, num2));
		entrada.close();
	}

}
