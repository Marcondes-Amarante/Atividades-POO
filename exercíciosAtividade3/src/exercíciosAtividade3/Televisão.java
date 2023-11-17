package exercíciosAtividade3;

public class Televisão {
	private String marca;
	private double polegadas;
	
	Televisão(){
		
	}
	
	Televisão (String marca, double polegadas){
		this.marca = marca;
		this.polegadas = polegadas;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	
	public double getPolegadas() {
		return this.polegadas;
	}
	
	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	
	public void exibirInforaçõesTv() {
		System.out.println("marca da tv: " +marca);
		System.out.println("quantidade de polegadas: " +polegadas);
	}
}
