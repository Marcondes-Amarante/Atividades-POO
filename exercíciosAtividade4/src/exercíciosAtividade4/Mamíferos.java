package exercíciosAtividade4;

public class Mamíferos extends Animal {
	
	private int quantidadeOssos;
	private int quantidadeDentes;
	private String alimento;
	
	Mamíferos(String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor,
			double velocidadeMédia, int quantidadeOssos, int quantidadeDentes, String alimento) {
		super(tipoDeAlimentação, ambiente, nome, comprimento, númeroDePatas, cor, velocidadeMédia);
		this.alimento = alimento;
		this.quantidadeDentes = quantidadeDentes;
		this.quantidadeOssos = quantidadeOssos;
	}

	public int getQuantidadeOssos() {
		return quantidadeOssos;
	}

	public void setQuantidadeOssos(int quantidadeOssos) {
		this.quantidadeOssos = quantidadeOssos;
	}

	public int getQuantidadeDentes() {
		return quantidadeDentes;
	}

	public void setQuantidadeDentes(int quantidadeDentes) {
		this.quantidadeDentes = quantidadeDentes;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
	public void dadosMamífero () {
		super.dados();
		System.out.println("quantidade de ossos: " +quantidadeOssos);
		System.out.println("qauntidade de dentes: " +quantidadeDentes);
		System.out.println("alimento: " +alimento);
		System.out.println();
	}
	
	
	
}
