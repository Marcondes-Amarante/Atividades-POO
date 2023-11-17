package exercíciosAtividade4;

public class Animal {
	
	
	private String tipoDeAlimentação;
	
	private String ambiente;
	private String nome;
	private double comprimento;
	private int númeroDePatas;
	private String cor;
	private double velocidadeMédia;
	
	Animal (String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor, double velocidadeMédia){
		this.tipoDeAlimentação = tipoDeAlimentação;
		this.ambiente = ambiente;
		this.nome = nome;
		this.comprimento = comprimento;
		this.númeroDePatas = númeroDePatas;
		this.cor = cor;
		this.velocidadeMédia = velocidadeMédia;
	}
	
	public void setTipoDeAlimentação(String tipoDeAlimentação) {
		this.tipoDeAlimentação = tipoDeAlimentação;
	}
	
	public String getTipoDeAlimentação() {
		return this.tipoDeAlimentação;
	}
	
	public void setHabitat(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public String getHabitat() {
		return this.ambiente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setComprimento (double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getComprimento () {
		return this.comprimento;
	}
	
	public void setNúmeroDePatas(int númeroDePatas) {
		this.númeroDePatas = númeroDePatas;
	}
	
	public int getNúmeroDePatas() {
		return this.númeroDePatas;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setVelocidadeMédia(double velocidadeMédia) {
		this.velocidadeMédia = velocidadeMédia;
	}
	
	public double getVelocidadeMédia() {
		return this.velocidadeMédia;
	}
	
	
	public void dados() {
		System.out.println("relatório do animal inserido: ");
		System.out.println("nome: " +nome);
		System.out.println("ambiente: " +ambiente);
		System.out.println("tipo de alimentação:" +tipoDeAlimentação);
		System.out.println("comprimento em cm: " +comprimento);
		System.out.println("número de patas: " +númeroDePatas);
		System.out.println("cor: " +cor);
		System.out.println("valocidade média em km/h: " +velocidadeMédia);
		System.out.println();
		
	}
}
