package basico;

import javax.swing.JOptionPane;

public class MetodosStrings {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Forne�a uma frase: ");
		int tamanho = frase.length();
		System.out.println("Frase: " + frase);
		System.out.println("tamanho: " + tamanho);
		System.out.println("Mai�scula: " + frase.toUpperCase());
		System.out.println("Min�scula: " + frase.toLowerCase());
		System.out.println("Remover espa�os antes e depois: " + frase.trim());
		System.out.println("Substituindo: " + frase.replace(" ", "-"));
		
		System.out.println("Mostrando caractere por caractere");
		for(int i=0;i<tamanho;i++)
			System.out.println(frase.charAt(i));
		
		
		
		
	}

}
