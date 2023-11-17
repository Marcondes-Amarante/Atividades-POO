package exercíciosAtividade4;

public class Répteis extends Animal {
	
	private String tipoEscamas;
	private boolean presençaMembrosLocomotores;
	
	Répteis(String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor,
			double velocidadeMédia, String tipoEscamas, boolean presençaMembrosLocomotores) {
		super(tipoDeAlimentação, ambiente, nome, comprimento, númeroDePatas, cor, velocidadeMédia);
		this.presençaMembrosLocomotores = presençaMembrosLocomotores;
		this.tipoEscamas = tipoEscamas;
	}

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}

	public boolean isPresençaMembrosLocomotores() {
		return presençaMembrosLocomotores;
	}

	public void setPresençaMembrosLocomotores(boolean presençaMembrosLocomotores) {
		this.presençaMembrosLocomotores = presençaMembrosLocomotores;
	}
	
	public void dadosRépteis () {
		super.dados();
		System.out.println("tipo de escamas: " +tipoEscamas);
		System.out.println("possui membros locmotores: " +presençaMembrosLocomotores);
	}
	
	
}
