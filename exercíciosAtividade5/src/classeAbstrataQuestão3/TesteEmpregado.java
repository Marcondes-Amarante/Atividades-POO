package classeAbstrataQuestão3;

public class TesteEmpregado {
	
	public static void main (String args[]) {
		
		Chefe chefe1 = new Chefe("joão", 34, 5000);
		System.out.println("o chefe ganha: "+chefe1.ganha());
		
		Comissionário comissionário1 = new Comissionário("Carlos", 25, 500, 20, 30);
		System.out.println("o comissionário ganhou: "+comissionário1.ganha());
		
		Horista horista1 = new Horista("Henrique", 28, 15, 300);
		System.out.println("o horista ganhou: "+horista1.ganha());
		
		Produção produção1 = new Produção("Pedro", 30, 25, 300);
		System.out.println("o responsável pelo setor de produção ganhou: "+produção1.ganha());
		
	}
	
}
