package demaisQuestões;

public class JogadorMario implements Jogador {
	
	double danoInfligido=5;
	boolean estrela;
	double velocidade=10;
	int moedas;
	
	public void andar() {
		if(estrela==true) {
			velocidade = velocidade*2;
			System.out.println("mario moveu-se a: "+velocidade);
		}else {
			System.out.println("mario moveu-se a: "+velocidade);
		}
	}
	
	public void pular() {
		System.out.println("mario pulou");
	}
	
	public void atacar() {
		danoInfligido++;
		System.out.println("mario atacou um inimigo: "+danoInfligido);
	}
	
	public void pegarMoedas() {
		moedas++;
		System.out.printf("mario pegou %d moedas", moedas);
	}
	
}
