package exercíciosAtividade3;

class Pessoa {
	private String nome;
	private double altura;
	private int idade;
	
	//método construtor vazio
	Pessoa(){
		
	}
	
	//método construtor que requisita valores para atributos na consturção de um objeto
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	//métodos getters e setters para cada atributo da classe
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	//método para imprimir informações de objetos da classe pessoa
	public void imprimeInformações () {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println();
	}
	
}
