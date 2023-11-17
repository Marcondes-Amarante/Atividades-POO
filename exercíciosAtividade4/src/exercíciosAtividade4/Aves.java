package exercíciosAtividade4;

public class Aves extends Animal{
	
	private String formatoBico;
	private int tamanhoBico;
	
	Aves(String tipoDeAlimentação, String ambiente, String nome, double comprimento, int númeroDePatas, String cor,
			double velocidadeMédia, String formatoBico, int tamanhoBico) {
		super(tipoDeAlimentação, ambiente, nome, comprimento, númeroDePatas, cor, velocidadeMédia);
		this.formatoBico = formatoBico;
		this.tamanhoBico = tamanhoBico;
	}

	public String getFormatoBico() {
		return formatoBico;
	}

	public void setFormatoBico(String formatoBico) {
		this.formatoBico = formatoBico;
	}

	public int getTamanhoBico() {
		return tamanhoBico;
	}

	public void setTamanhoBico(int tamanhoBico) {
		this.tamanhoBico = tamanhoBico;
	}
	
	public void dadosAves () {
		super.dados();
		System.out.println("tipo de formato do bico: " +formatoBico);
		System.out.println("tamanho do bico em cm: " +tamanhoBico);
	}
	
	
	
	
}
