package classeAbstrataQuestão4;

public class TesteVeículo {
	
	public static void main(String args[]) {
		
		Carro carro1 = new Carro(120, "fiat", 3400, 4);
		System.out.println("o carro moveu-se por: "+carro1.mover(30));
		carro1.converterTempo(carro1.tempoViagem());
		
		Avião avião1 = new Avião(800, "embraer", 540000000);
		System.out.println();
		System.out.println("o avião moveu-se por: "+avião1.mover(400));
		System.out.printf("tipo: %s", avião1.tipo());
		
		Barco barco1 = new Barco(500, "LeveFort", 54200, 20);
		System.out.println();
		System.out.println();
		System.out.println("o barco moveu-se por: "+barco1.mover(200));
		System.out.printf("tipo: %s, capacidade: %s", barco1.retornarTipo(), barco1.capacidade());
	}	
}
