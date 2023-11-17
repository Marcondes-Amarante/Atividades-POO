package questão4;

public class Divisão implements OperaçãoMatemática {
	
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	Divisão(){
		
	}
	
	public double calcula(double a, double b) {
		double divisão = a/b;
		return divisão;
	}
	
}
