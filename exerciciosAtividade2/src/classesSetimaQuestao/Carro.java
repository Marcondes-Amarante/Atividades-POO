package classesSetimaQuestao;

public class Carro {
	String marca;
	String modelo;
	int velocidadeAtual;
	
	
	void acelera () {
		this.velocidadeAtual = velocidadeAtual+10;
	}
	
	void freia() {
		this.velocidadeAtual = velocidadeAtual - 10;
	}
}


