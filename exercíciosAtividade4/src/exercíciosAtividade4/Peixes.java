package exercíciosAtividade4;

public class Peixes extends Animal{
	
	private boolean presençaDeBarbatana;
	private String tipoBarbatanas;
	private String característica;
	
	Peixes(String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor,
			double velocidadeMédia, boolean presençaDeBarbatana, String tipoBarbatanas, String característica) {
			super(tipoDeAlimentação, ambiente, nome, comprimento, númeroDePatas, cor, velocidadeMédia);
			this.característica = característica;
			this.presençaDeBarbatana = presençaDeBarbatana;
			this.tipoBarbatanas = tipoBarbatanas;
	}

	public boolean isPresençaDeBarbatana() {
		return presençaDeBarbatana;
	}

	public void setPresençaDeBarbatana(boolean presençaDeBarbatana) {
		this.presençaDeBarbatana = presençaDeBarbatana;
	}

	public String getTipoBarbatanas() {
		return tipoBarbatanas;
	}

	public void setTipoBarbatanas(String tipoBarbatanas) {
		this.tipoBarbatanas = tipoBarbatanas;
	}

	public String getCaracterística() {
		return característica;
	}

	public void setCaracterística(String característica) {
		this.característica = característica;
	}
	
	
	public void dadosPeixe () {
		super.dados();
		System.out.println("presença de barbatanas: " +presençaDeBarbatana);
		System.out.println("tipo de barbatanas: " +tipoBarbatanas);
		System.out.println("característica: " +característica);
	}
	
}
