package exercíciosAtividade7;

import javax.swing.JOptionPane;

public class Questão5 {
	
	public static int EncontrarMáximo(int[] x, int quantidade) {
		
		int máximo = x[0];
		
		for(int i=0; i<quantidade; i++) {
			if(x[i]>máximo) {
				máximo = x[i];
			}
		}
		
		return máximo;
	}
	
	
	public static int EncontrarMínimo(int[]x, int quantidade) {
		
		int mínimo= x[0];
		
		for(int i=0; i<quantidade; i++) {
			if(x[i]<mínimo) {
				mínimo = x[i];
			}
		}
		
		return mínimo;
	}
	
	public static void main(String args[]) {
		
		//declaração do array que receberá a lista de números do usuário
		int[] numeros;
		
		//recebimento do tamanho do arry
		int quantidade = Integer.valueOf(JOptionPane.showInputDialog("digite o tamanho de elementos do array: "));
		
		//especificação do tamanho do array por meio da criação de um objeto array do tipo int de tamanho quantidade
		numeros = new int[quantidade];
		
		//preenchimento do array com a lista de números fornecida pelos usuários
		for(int i=0; i<quantidade; i++) {
			numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("digite um valor para a posição "+ i));
		}
		
		int máximo = EncontrarMáximo(numeros, quantidade);
		int mínimo = EncontrarMínimo(numeros, quantidade);
		
		System.out.println("tamanho do array: "+quantidade);
		System.out.println("maior elemento do array: "+máximo);
		System.out.println("menor elemento do array: "+mínimo);
		
		//imprimindo elementos povoados no array
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
	
}
