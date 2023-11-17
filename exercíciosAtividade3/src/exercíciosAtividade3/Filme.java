package exercíciosAtividade3;

public class Filme {
	
	private String título;
	private int duracaoEmMinutos;
	
	Filme(){
		
	}
	
	Filme(String título, int duracaoEmMinutos){
		this.título = título;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	
	public String getTítulo() {
		return this.título;
	}
	
	public void setTítulo(String título) {
		this.título = título;
	}
	
	public int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos (int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	
	public void exibirDuracaoEmHoras (int duracaoEmMinutos, String título) {
		
		int horas;
		horas = duracaoEmMinutos/60;
		int minutos = duracaoEmMinutos%60;
		System.out.printf("o filme %s possui %d horas e %d minutos de duracao", título, horas, minutos);
		System.out.println();
		
	}
}
