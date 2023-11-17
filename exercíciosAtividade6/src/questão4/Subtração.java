package questão4;

public class Subtração implements OperaçãoMatemática {
	
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

	Subtração(){
		
	}
	
	public double calcula(double a, double b) {
		double subtração = a-b;
		return subtração;
	}
}
