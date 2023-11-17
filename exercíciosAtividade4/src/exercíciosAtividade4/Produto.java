package exercíciosAtividade4;

public class Produto {
	private String nome;
	private double preço;
	
	Produto(String nome, double preço){
		this.nome = nome;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreço() {
		return preço;
	}
	
	
	public void tostring() {
		System.out.printf("nome do produto: %s", nome);
		System.out.println();
		System.out.printf("preço do produto: %s", preço);
		System.out.println();
		System.out.println();
	}
	
	
}
