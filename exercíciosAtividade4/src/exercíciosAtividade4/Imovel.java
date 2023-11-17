package exercíciosAtividade4;

public class Imovel {
	private String endereço;
	private double preço;
	
	
	Imovel(String endereço, double preço){
		this.endereço = endereço;
		this.preço = preço;
	}
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public void exibirPreço() {
		System.out.println("valor do imóvel: " +this.preço);
		System.out.println();
	}
	
}
