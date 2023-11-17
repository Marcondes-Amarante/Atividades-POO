package classeAbstrataQuestão4;

public abstract class Veículo {
	
	private double velocidade;
	private String marca;
	private int metros;
	
	Veículo(){
		
	}
	
	Veículo(double velocidade, String marca, int metros){
		this.velocidade = velocidade;
		this.marca = marca;
		this.metros = metros;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public int getMetros() {
		return metros;
	}
	
	public void setMetros(int metros) {
		this.metros = metros;
	}
	
	abstract int mover(int metros);
}
