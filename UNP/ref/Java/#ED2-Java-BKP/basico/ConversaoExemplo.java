package basico;

import javax.swing.JOptionPane;

public class ConversaoExemplo {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite um n�mero: ");
		//int num = Integer.parseInt(valor);
		double value = Double.parseDouble(valor);
		JOptionPane.showMessageDialog(null, "O dobro �: " + (value * 2) );
		System.out.println("O dobro �: " + (value * 2) );

	}

}
