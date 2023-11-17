package classeAbstrataQuestão3;

public class Chefe extends Empregado {

	private String nome;
	private int idade;
	private double salario;
	
	
	public Chefe() {
		
	}
	
	public Chefe (String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	

	public double ganha () {
		return this.salario;
	}
	
}
