package basico;

import java.util.Scanner;

public class Cachorro {
	// atributos
	String nome;
	int idade;
	char sexo;
	String raca;

	// m�todos
	void latir() {
		System.out.println("O c�o chamado " + nome + " est� latindo!");
	}

	void passear() {
		System.out.println("O c�o chamado " + nome + " est� passeando!");
	}

	void passear(int km) {
		System.out.println("O c�o chamado " + nome + " est� passeando!");
		System.out.println("Ele vai passear " + km + " km");
	}

	void comer() {
		System.out.println("O c�o chamado " + nome + " est� comendo!");
	}

	void exibeDados() {
		System.out.println("");
		System.out.println("=================");
		System.out.println("Nome.......: " + nome);
		System.out.println("Idade......: " + idade);
		System.out.println("Sexo.......: " + sexo);
		System.out.println("Ra�a.......: " + raca);
		System.out.println("=================");
		System.out.println("");
	}

	void insereDados() {
		// Cachorro cao = new Cachorro();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do c�o: ");
		this.nome = sc.nextLine();
		System.out.println("Digite a ra�a do c�o: ");
		raca = sc.nextLine();
		System.out.println("Digite a idade do c�o: ");
		idade = sc.nextInt();
		System.out.println("Digite o sexo do c�o ('M' ou 'F')");
		sexo = sc.next().toUpperCase().charAt(0);
		sc.close();
		// return c;
	}

}
