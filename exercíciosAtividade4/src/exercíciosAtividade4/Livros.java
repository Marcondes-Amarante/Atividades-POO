package exercíciosAtividade4;

public class Livros extends Produto{
	
	private String autor;
	
	Livros(String nome, double preço, String autor) {
		super(nome, preço);
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	@Override
	public void tostring() {
		super.tostring();
		System.out.printf("nome do autor: %s", autor);
		System.out.println();
	}
	
}
