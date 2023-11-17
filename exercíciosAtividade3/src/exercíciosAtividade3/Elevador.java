package exercíciosAtividade3;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantidadeDePessoas;
	
	Elevador(int totalAndares, int andarAtual, int capacidade, int quantidadeDePessoas){
		this.totalAndares = totalAndares;
		this.andarAtual = andarAtual;
		this.capacidade = capacidade;
		this.quantidadeDePessoas = quantidadeDePessoas;
	}
	
	public void setAndarAtual (int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	public int getAndarAtual() {
		return this.andarAtual;
	}
	
	public void setTotalAnadares (int totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	public int getTotalAndares() {
		return this.totalAndares;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getCapaciade () {
		return this.capacidade;
	}
	
	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}
	
	public int getQuantidadeDePessoas() {
		return this.quantidadeDePessoas;
	}
	
	
	public void inicializar(int capacidade, int totalAndares) {
		andarAtual = 0;
		quantidadeDePessoas = 0;	
	}
	
	
	public void entrar (int capacidade, int quantidadeDePessoas) {
		if(quantidadeDePessoas<capacidade) {
			this.quantidadeDePessoas = quantidadeDePessoas+1;
		}
	}
	
	public void sair (int quantidadeDePessoas) {
		if(quantidadeDePessoas>=1) {
			this.quantidadeDePessoas = quantidadeDePessoas-1;
		}
	}
	
	public void sobe (int andarAtual) {
		if(andarAtual<totalAndares) {
			this.andarAtual = andarAtual+1;
		}
	}
	
	public void desce (int andarAtual) {
		if(andarAtual>0) {
			this.andarAtual = andarAtual-1;
		}
	}
}
