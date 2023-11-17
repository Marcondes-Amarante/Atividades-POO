package questão4;

public class Adição implements OperaçãoMatemática{
	
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
	

	Adição(){
		
	}
	
	public double calcula (double a, double b) {
		double soma = a+b;
		return soma;
	}
	
}
