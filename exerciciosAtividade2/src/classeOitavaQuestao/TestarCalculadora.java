package classeOitavaQuestao;

import javax.swing.JOptionPane;

public class TestarCalculadora {
	
	public static void main(String args[]) {
		
		Calculadora operacao1 = new Calculadora();
		operacao1.numero1 = Integer.valueOf(JOptionPane.showInputDialog("digite um número para num1"));
		operacao1.numero2 = Integer.valueOf(JOptionPane.showInputDialog("digite um número para num2"));
		
		System.out.println(operacao1.somar());
		System.out.println(operacao1.subtratir());
		System.out.println(operacao1.multiplicacao());
		System.out.println(operacao1.divisao());
	}
}
