package exercíciosAtividade4;

public class Novo extends Imovel{
	
	private double adicional;
	
	Novo(String endereço, double preço, double adicional) {
		super(endereço, preço);
		this.adicional = adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double getAdicional () {
		return this.adicional;
	}
	
	@Override
	public void exibirPreço () {
		double preçoTotal = getPreço()+getAdicional();
		System.out.println("valor adicional: " +getAdicional());
		System.out.println("preço do imóvel: " +preçoTotal);
		System.out.println();
	}
	
}
