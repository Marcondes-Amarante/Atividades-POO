package classesSetimaQuestao;

public class TesteCarro {
	
	public static void main(String args[]) {
		
		Carro carro1 = new Carro();
		carro1.marca = "bmw";
		carro1.modelo = "esportivo";
		carro1.velocidadeAtual = 40;
		
		carro1.acelera();
		
		System.out.println("velocidade apos acelerar: "+ carro1.velocidadeAtual);
		
		carro1.freia();
		System.out.println("velocidade apos freiar: "+ carro1.velocidadeAtual);
		
	}
}
