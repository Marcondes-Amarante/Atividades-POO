package exercíciosAtividade3;

public class TesteElevador {
	
	public static void main(String args[]) {
		
		Elevador elevadorPrincipal = new Elevador(20, 5, 10, 2);
		
		elevadorPrincipal.inicializar(20, 10);
		
		elevadorPrincipal.entrar(10, elevadorPrincipal.getQuantidadeDePessoas());
		elevadorPrincipal.entrar(10, elevadorPrincipal.getQuantidadeDePessoas());
		
		System.out.println("pessoas no elevador: " +elevadorPrincipal.getQuantidadeDePessoas());
		
		elevadorPrincipal.sair(elevadorPrincipal.getQuantidadeDePessoas());
		
		System.out.println("pessoas no elevador: " +elevadorPrincipal.getQuantidadeDePessoas());
		
		
		elevadorPrincipal.sobe(elevadorPrincipal.getAndarAtual());
		elevadorPrincipal.sobe(elevadorPrincipal.getAndarAtual());
		
		System.out.println("andar atual: " +elevadorPrincipal.getAndarAtual());
		
		elevadorPrincipal.desce(elevadorPrincipal.getAndarAtual());
		
		System.out.println("andar atual: " +elevadorPrincipal.getAndarAtual());
		
	}
}
