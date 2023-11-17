package exercíciosAtividade3;

public class TestarLivro {

	public static void main(String args[]) {
		
		Livro pequenoPrincipe = new Livro("o pequeno principe");
		pequenoPrincipe.setQtdPáginas(98);
		pequenoPrincipe.setPáginasLidas(14);
		
		System.out.printf("O livro %s possui %d páginas", pequenoPrincipe.getTítulo(), pequenoPrincipe.getqtdPáginas());
		System.out.println();
		
		pequenoPrincipe.setPáginasLidas(20);
			
		pequenoPrincipe.verificarProgresso(pequenoPrincipe.getPáginasLidas(), pequenoPrincipe.getqtdPáginas());
		System.out.println();
		
		pequenoPrincipe.setPáginasLidas(50);
		
		pequenoPrincipe.verificarProgresso(pequenoPrincipe.getPáginasLidas(), pequenoPrincipe.getqtdPáginas());
		System.out.println();
		
		
				
		Livro meuLivro = new Livro("Volta ao mundo em 80 dias", 164, 6);
		
		System.out.println();
		System.out.printf("O livro %s possui %d páginas", meuLivro.getTítulo(), meuLivro.getqtdPáginas());
		
		System.out.println();
		meuLivro.verificarProgresso(meuLivro.getPáginasLidas(), meuLivro.getqtdPáginas());
	}
}
