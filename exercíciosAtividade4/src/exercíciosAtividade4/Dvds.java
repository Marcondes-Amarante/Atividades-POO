package exercíciosAtividade4;

public class Dvds extends Produto {

	private int duração;
	
	Dvds(String nome, double preço, int duração) {
		super(nome, preço);
		this.duração = duração;
	}

	public int getDuração() {
		return duração;
	}
	
	@Override
	public void tostring() {
		super.tostring();
		System.out.printf("duração do filme em minutos: %d", duração);
		System.out.println();
	}
	
}
