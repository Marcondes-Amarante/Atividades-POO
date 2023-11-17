package classeAbstrataQuestão3;

public abstract class Empregado {
	
	public String nome;
	public int idade;
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public abstract double ganha();
	
}
