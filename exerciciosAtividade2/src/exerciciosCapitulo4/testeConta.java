package exerciciosCapitulo4;

public class testeConta {

	public static void main (String args[]) {
		
		Conta conta1 = new Conta();
		conta1.nomeDoTitular = "Marcondes";
		conta1.numero = 213213;
		conta1.agencia = "ejwkq213";
		conta1.saldo = 1500;
		conta1.dataAbertura = "30 de março";
		
		Conta conta2 = new Conta();
		conta2.nomeDoTitular = "Marcondes";
		conta2.numero = 213213;
		conta2.agencia = "ejwkq213";
		conta2.saldo = 1500;
		conta2.dataAbertura = "30 de março";
		
		conta1.recuperaDadosParaImpressao();
		conta2.recuperaDadosParaImpressao();
		
		conta1.nomeDoTitular = "bruno";
		
		
		//por padrão, dois objetos de uma mesma classe serão diferentes mesmo que com atributos iguais
		//isso ocorre pois ao utilizarmos a lógica comparativa acima, nosso elemento de comparação é o endereço de
		//memória de cada objeto e não seus atributos
		
		//para comparar atributos de objetos distintos de uma mesma classe devemos compara-lós indivudlamente ou usar o equals
		
		
		conta2 = conta1;
		//quando atribuimos um objeto a outro de mesma classe, ambos passsam a aponta para o mesmo objeto, e portanto
		//passam a referenciar o mesmo objeto na memória, logo quando comparadas através de == retornam true
		
		
		if (conta1==conta2) {
			System.out.println("contas iguais");
		} else {
			System.out.println("contas diferentes");
		}
		
		
		if (conta1.nomeDoTitular == conta2.nomeDoTitular) {
			System.out.println("mesmos titulares");
		} else {
			System.out.println("titulares diferentes");
		}
	
		
	}
	
}
