package exercíciosAtividade7;
import javax.swing.JOptionPane;

public class Questão8 {
	
	public static void main(String args[]) {
		
		int quantidade = Integer.valueOf(JOptionPane.showInputDialog("digite o tamanho do vetor"));
		
		String[] nomes = new String[quantidade];
		
		for(int i=0; i<quantidade; i++) {
			nomes[i] = JOptionPane.showInputDialog("digite um nome completo:");
		}
		
		//atribuindo a array's de string o primeiro e último nome respectivos:
		
		String[] primeiroNome = new String[quantidade];
		String[] últimoNome = new String[quantidade];
		
		for(int i=0; i<quantidade; i++) {
			int indiceEspaço = nomes[i].indexOf(" ");
			
			if(indiceEspaço!=-1) {
				primeiroNome[i]=nomes[i].substring(0, indiceEspaço);
			}else {
				primeiroNome[i] = nomes[i];
			}
		}
		
		for(int i=quantidade-1; i>=0; i--) {
			int indiceEspaço = nomes[i].lastIndexOf(" ");
			
			if(indiceEspaço!=-1) {
				últimoNome[i]=nomes[i].substring(indiceEspaço+1);
			}else {
				últimoNome[i] = nomes[i];
			}
		}
		
		//exibindo apenas os primeiros nomes
		for(String primeiro : primeiroNome) {
			System.out.printf(primeiro +" ");
		}
		
		System.out.println();
		
		//exibindo apenas os últimos nomes:
		for(String último: últimoNome) {
			System.out.print(último + " ");
		}
		
	}
}
