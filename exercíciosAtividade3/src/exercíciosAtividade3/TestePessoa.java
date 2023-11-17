package exercíciosAtividade3;

public class TestePessoa {
	
	public static void main (String args[]) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("joao");
		pessoa1.setAltura(1.68);
		pessoa1.setIdade(18);
		
		pessoa1.imprimeInformações();
		
		Pessoa pessoa2 = new Pessoa("Pedro", 20);
		pessoa2.setAltura(1.75);
		
		pessoa2.imprimeInformações();
		
	}
	
}
