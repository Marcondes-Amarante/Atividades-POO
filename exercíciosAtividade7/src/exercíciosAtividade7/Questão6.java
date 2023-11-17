package exercíciosAtividade7;
import javax.swing.JOptionPane;

public class Questão6 {
	
	public static void main(String args[]) {
		
		int quantidade = Integer.valueOf(JOptionPane.showInputDialog("digite o tamanho do array: "));
		int[] numeros = new int[quantidade];
		
		for(int i=0; i<quantidade; i++) {
			numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("digite um número para a posição "+i));
		}
		
		int soma=0;
		
		for(int i=0; i<quantidade; i++) {
			soma= soma+numeros[i];
		}
		
		System.out.println("tamanho do array: "+quantidade);
		System.out.println("soma dos elementos do array: "+soma);
		
		for(int numero : numeros) {
			System.out.print(numero);
		}
	}
	
}
