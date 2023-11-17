package exercíciosAtividade4;

public class Velho extends Imovel{
	
	private double desconto;
	
	Velho(String endereço, double preço, double desconto) {
		super(endereço, preço);
		this.desconto= desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public void exibirPreço() {
		double preçoTotal = getPreço()-getDesconto();
		System.out.println("valor adicional: " +getDesconto());
		System.out.println("preço do imóvel: " +preçoTotal);
		System.out.println();
	}
}
