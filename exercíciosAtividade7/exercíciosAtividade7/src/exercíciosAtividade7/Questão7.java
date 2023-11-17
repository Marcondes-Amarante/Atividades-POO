package exercíciosAtividade7;

import javax.swing.JOptionPane;

public class Questão7 {
	
	public static void main(String args[]) {
		
		int quantidade = Integer.valueOf(JOptionPane.showInputDialog("digite o tamanho do array: "));
		int[] numeros = new int[quantidade];
		
		for(int i=0; i<quantidade; i++) {
			numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("digite um número para a posição "+i));
		}
		
		//array antes da ordenação:
		
		System.out.print("array antes da ordenacao: ");
		
		for(int numero : numeros) {
			System.out.print(numero);
		}
		
		System.out.println();
		
		//ordenar array:
		for(int i=0; i<quantidade; i++) {
			for(int j=0; j<quantidade-1; j++) {
				if(numeros[j]>numeros[j+1]) {
					int aux = numeros[j+1];
					numeros[j+1]=numeros[j];
					numeros[j]=aux;
				}
			}
		}
		
		System.out.print("vetor apos a ordenacao: ");
		
		//array pós ordenação:
		for(int numero : numeros) {
			System.out.print(numero);
		}
	}
}
