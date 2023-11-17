package demaisQuestões;

public class JogadorLuigi implements Jogador{
	
	double danoInfligido=5;
	boolean florDeFogo;
	double altura=1;
	boolean capa;
	
	public void andar() {
		System.out.println("luigi moveu-se");
	}
	
	public void pular() {
		System.out.println("luigi pulou");
	}
	
	public void atacar() {
		
		if(florDeFogo==true) {
			danoInfligido = danoInfligido + 10;
			System.out.println("luigi atacou um inimigo: "+danoInfligido);
		}else {
			System.out.println("luigi atacou um inimigo: "+danoInfligido);
		}
		
	}
	
	public void planar() {
		if(capa==true) {
			altura = altura*5;
			System.out.printf("luigi planou a uma altura de: %f m", altura);
		}else {
			System.out.printf("luigi planou a uma altura de: %f m", altura);
		}
	}
	
}
