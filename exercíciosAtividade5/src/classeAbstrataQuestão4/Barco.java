package classeAbstrataQuestão4;

public class Barco extends Veículo{
	
	private int tamanho;
	private String tipo;
	private String capacidade;
	
	
	public String getTipo() {
		return tipo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public int getTamanho() {
		return tamanho;
	}

	Barco(){
		
	}
	
	Barco(double velocidade, String marca, int metros, int tamanho){
		super(velocidade, marca, metros);
		this.tamanho = tamanho;
	}
	
	public int mover(int metros) {
		return this.getMetros()+metros;
	}
	
	public String retornarTipo() {
		if((this.getTamanho()>4 && this.getTamanho()<=10)) {
			tipo = "embarcação de lazer";
		} else if(this.getTamanho()>10 && this.getTamanho()<=30) {
			tipo = "barco de transporte";
		} else if(this.getTamanho()>100 && this.getTamanho()<=400) {
			tipo = "navio";
		}
		
		return tipo;
	
	}
	
	public String capacidade() {
		if(this.getTipo()=="embarcação de lazer") {
			capacidade = "de 2 a 10 pessoas";
		} else if(this.getTipo()=="barco de transporte") {
			capacidade = "de 10 a 100 pessoas";
		} else if(this.getTipo()=="navio") {
			capacidade = "de 500 a 5000 pessoas";
		}

		return capacidade;
	}
	
	
	
}
