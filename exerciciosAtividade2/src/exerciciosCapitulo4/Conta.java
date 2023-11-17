package exerciciosCapitulo4;

public class Conta {
	
	//1° questão: modelar classe conta
	
	String nomeDoTitular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
		
	void sacar(int quantidadeSacar) {
		this.saldo = saldo - quantidadeSacar;
	}
		
	void depositar(int quantidadeDepositar) {
		this.saldo = saldo + quantidadeDepositar;
	}
		
	void rendimentos() {
		this.saldo = saldo * 0.1;
	}
	
	void recuperaDadosParaImpressao() {
		System.out.println(nomeDoTitular);
		System.out.println(numero);
		System.out.println(agencia);
		System.out.println(saldo);
		System.out.println(dataAbertura);
		System.out.println();
		
	}

}

	