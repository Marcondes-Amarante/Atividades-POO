package classeOitavaQuestao;

public class Calculadora {
	int numero1;
	int numero2;
	int resultado;
	
	int somar() {
		this.resultado = this.numero1 +this.numero2;
		return resultado;
	}
	
	int subtratir() {
		this.resultado = this.numero1 - this.numero2;
		return resultado;
	}
	
	int multiplicacao() {
		this.resultado = this.numero1 * this.numero2;
		return resultado;
	}
	
	double divisao() {
		double resultadoD = ((double)this.numero1/(double)this.numero2);
		return resultadoD;
	}
	
	
}
