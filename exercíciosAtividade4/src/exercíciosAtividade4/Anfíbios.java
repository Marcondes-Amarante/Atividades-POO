package exercíciosAtividade4;

public class Anfíbios extends Animal {
	
	private String métodoRespiratório;
	private String tipoDePele;
	
	Anfíbios(String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor,
			double velocidadeMédia, String métodoRespiratório, String tipoDePele) {
		super(tipoDeAlimentação, ambiente, nome, comprimento, númeroDePatas, cor, velocidadeMédia);
		this.métodoRespiratório = métodoRespiratório;
		this.tipoDePele = tipoDePele;
	}

	public String getMétodoRespiratório() {
		return métodoRespiratório;
	}

	public void setMétodoRespiratório(String métodoRespiratório) {
		this.métodoRespiratório = métodoRespiratório;
	}

	public String getTipoDePele() {
		return tipoDePele;
	}

	public void setTipoDePele(String tipoDePele) {
		this.tipoDePele = tipoDePele;
	}
	
	public void dadosAnfíbios () {
		super.dados();
		System.out.println("método respiratório: " +métodoRespiratório);
		System.out.println("tipo de pele: " +tipoDePele);
	}
}
