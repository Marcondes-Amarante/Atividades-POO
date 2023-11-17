package exercíciosAtividade3;

public class ControleRemoto {
	private int volume;
	private int canal;
	
	
	ControleRemoto(){
		
	}
	
	ControleRemoto(int volume, int canal){
		this.volume = volume;
		this.canal = canal;
	}
	
	
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	
	
	public void aumentaVolume() {
		this.volume = volume+1;
	}
	
	public void diminuiVolume() {
		this.volume = volume-1;
	}
	
	public void aumentaCanal() {
		this.canal = canal+1;
	}
	
	public void diminuiCanal() {
		this.canal = canal-1;
	}
	
	public void trocaCanalIndicado (int canal) {
		this.canal = canal;
	}
	
	
	public void exibirCanal() {
		System.out.println();
		System.out.println("canal atual: " +canal);
	}
	
	public void exibirVolume() {
		System.out.println();
		System.out.println("volume: "+volume);
	}
}
