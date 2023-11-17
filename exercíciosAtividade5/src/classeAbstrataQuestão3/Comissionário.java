package classeAbstrataQuestão3;

public class Comissionário extends Empregado {
	
	private String nome;
	private int idade;
	private double valorFixo;
	private double comissão;
	private int vendas;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getValorFixo() {
		return valorFixo;
	}

	public double getComissão() {
		return comissão;
	}

	public int getVendas() {
		return vendas;
	}

	public Comissionário () {
		
	}
	
	public Comissionário (String nome, int idade, double valorFixo, double comissão, int vendas) {
		super(nome, idade);
		this.valorFixo = valorFixo;
		this.comissão =comissão;
		this.vendas = vendas;
	}
	
	public double ganha() {
		return (valorFixo + comissão)*vendas;
	}
	
}
