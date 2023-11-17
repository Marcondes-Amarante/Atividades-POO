package exercíciosAtividade4;

public class TestarImovelVelhoENovo {
	
	public static void main(String args[]) {
		
		Imovel imovel1 = new Imovel("rua governador valadares", 1500);
		imovel1.exibirPreço();
		
		Novo imovel2 = new Novo("rua santa isabel", 2200, 200);
		imovel2.exibirPreço();
		
		Velho imovel3 = new Velho("Avenida albeto silva", 1200, 200);
		imovel3.exibirPreço();
		
	}
}
