package exercíciosAtividade4;

public class Cds extends Produto{
	
	private int númeroFaixas;

	Cds(String nome, double preço, int númeroFaixas) {
		super(nome, preço);
		this.númeroFaixas = númeroFaixas;
	}
	
	public int getNúmeroFaixas() {
		return númeroFaixas;
	}
	
	@Override
	public void tostring() {
		super.tostring();
		System.out.printf("número de faixas: %d", númeroFaixas);
		System.out.println();
	}
	
}
