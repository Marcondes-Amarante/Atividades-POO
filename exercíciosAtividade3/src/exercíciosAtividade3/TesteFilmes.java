package exercíciosAtividade3;

public class TesteFilmes {
	
	public static void main(String args[]) {
		
		Filme filme1 = new Filme();
		filme1.setTítulo("titanic");
		filme1.setDuracaoEmMinutos(194);
		
		filme1.exibirDuracaoEmHoras(filme1.getDuracaoEmMinutos(), filme1.getTítulo());
		
		Filme melhorFilme = new Filme("Forest Gump", 142);
		melhorFilme.exibirDuracaoEmHoras(melhorFilme.getDuracaoEmMinutos(), melhorFilme.getTítulo());
		
		Filme meuFilmeFavorito = new Filme("John Wick - de volta ao jogo", 100);
		meuFilmeFavorito.setDuracaoEmMinutos(96);
		meuFilmeFavorito.exibirDuracaoEmHoras(meuFilmeFavorito.getDuracaoEmMinutos(), meuFilmeFavorito.getTítulo());
		
		
	}
	
}
