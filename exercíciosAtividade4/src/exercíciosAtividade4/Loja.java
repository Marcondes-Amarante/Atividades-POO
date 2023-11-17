package exercíciosAtividade4;

public class Loja {
	
	public static void main (String args[]) {
		
		Produto[] produtosCadastrados = new Produto[3];
		produtosCadastrados[0] = new Livros("pequeno princípe", 30, "Jean");
		produtosCadastrados[1] = new Cds("meteora-Linkin park", 40, 25);
		produtosCadastrados[2] = new Dvds("transformers: a vinganças dos derrotados", 25, 150);
		
		produtosCadastrados[0].tostring();
		produtosCadastrados[1].tostring();
		produtosCadastrados[2].tostring();
		
		
	}
}
