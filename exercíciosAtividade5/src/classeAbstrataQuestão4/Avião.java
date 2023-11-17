package classeAbstrataQuestão4;

public class Avião extends Veículo {
	
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	Avião(){
		
	}
	
	Avião(double velocidade, String marca, int metros){
		super(velocidade, marca, metros);
	}
	
	public int mover(int metros) {
		return this.getMetros()+metros;
	}
	
	public String tipo() {
		
		if(this.getVelocidade()>=850 && this.getVelocidade()<=900) {
			tipo = "avião de passageiros comerciais";
		} else if(this.getVelocidade()>=750 && this.getVelocidade()<=850) {
			tipo = "jato exectivo";
		} else if(this.getVelocidade()>=900 && this.getVelocidade()<=1500) {
			tipo = "avião militar";
		} else if(this.getVelocidade()>=700 && this.getVelocidade()<850) {
			tipo = "aviçao de carga";
		}
		
		return tipo;
	}
}
