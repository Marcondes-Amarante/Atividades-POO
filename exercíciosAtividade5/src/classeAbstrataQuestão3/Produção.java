package classeAbstrataQuestão3;

public class Produção extends Empregado{

	private String nome;
	private int idade;
	private int valorProdução;
	private int qtdProduzida;

	
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

	public int getValorProdução() {
		return valorProdução;
	}

	public int getQtdProduzida() {
		return qtdProduzida;
	}

	Produção(){
		
	}
	
	Produção(String nome, int idade, int valorProdução, int qtdProdução){
		super(nome, idade);
		this.valorProdução = valorProdução;
		this.qtdProduzida = qtdProdução;
	}
	
	public double ganha() {
		return valorProdução * qtdProduzida;
	}
	
}
