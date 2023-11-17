package exercíciosAtividade3;

public class Livro {
	private String título;
	private int qtdPáginas;
	private int páginasLidas;
	
	Livro(){
		
	}
	
	Livro (String título, int qtdPáginas, int páginasLidas){
		this.título = título;
		this.qtdPáginas = qtdPáginas;
		this.páginasLidas = páginasLidas;
	}
	
	Livro (String título){
		this.título = título;
	}
	
	public String getTítulo() {
		return this.título;
	}
	
	public int getqtdPáginas() {
		return this.qtdPáginas;
	}
	
	public int getPáginasLidas () {
		return this.páginasLidas;
	}
	
	public void setQtdPáginas(int qtdPáginas) {
		this.qtdPáginas = qtdPáginas;
	}
	
	public void setPáginasLidas (int páginasLidas) {
		this.páginasLidas = páginasLidas;
	}
	
	public void verificarProgresso(int páginasLidas, int qtdPáginas) {
		double porcentagem;
		porcentagem = (double)(páginasLidas*100)/qtdPáginas;
		
		System.out.printf("você ja leu %.1f por cento do livro", porcentagem);
	}
}
