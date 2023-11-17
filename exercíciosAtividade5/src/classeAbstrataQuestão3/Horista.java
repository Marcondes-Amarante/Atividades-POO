package classeAbstrataQuestão3;

public class Horista extends Empregado{
	
	private String nome;
	private int idade;
	private double valorHora;
	private int horasTrabalhadas;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	Horista(){
		
	}
	
	Horista (String nome, int idade, double valorHora, int horasTrabalhadas){
		super(nome, idade);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double ganha() {
		return valorHora * horasTrabalhadas;
	}
	
	
}
