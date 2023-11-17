package classeAbstrataQuestão4;

public class Carro extends Veículo {
	
	private int numPortas;
	
	Carro(){
		
	}
	
	Carro(double velocidade, String marca, int metros, int numPortas){
		super(velocidade, marca, metros);
		this.numPortas = numPortas;
	}
	

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	
	public int mover(int metros) {
		return this.getMetros()+metros;
	}
	
	public int tempoViagem() {
		int tempo;
		tempo= this.getMetros()/(int)this.getVelocidade();
		return tempo;
	}
	
	public void converterTempo(int tempo) {
		int horas;
		int minutos;
		
		horas = tempo/60;
		minutos = tempo%60;
		
		System.out.println(horas + " horas e " + minutos + " minutos");
	}
}
