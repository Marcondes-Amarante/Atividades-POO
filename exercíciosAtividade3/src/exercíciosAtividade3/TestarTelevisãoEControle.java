package exercíciosAtividade3;

public class TestarTelevisãoEControle {
	
	public static void main(String args[]) {
		
		Televisão novaTelevisão = new Televisão("samsung", 50);
		novaTelevisão.exibirInforaçõesTv();
		
		ControleRemoto controleOriginal = new ControleRemoto(25, 11);
		
		//mudar para o canal 12
		controleOriginal.aumentaCanal();
		
		//voltar para o canal 11
		controleOriginal.diminuiCanal();
		
		//aumentar o volume para 30
		for (int i=1; i<=5; i++) {
			controleOriginal.aumentaVolume();
		}
		
		//diminuir o volume para 29
		controleOriginal.diminuiVolume();
		
		//trocar canal para o indicado
		controleOriginal.trocaCanalIndicado(20);
		
		//verificar canal e volume atuais
		controleOriginal.exibirCanal();
		controleOriginal.exibirVolume();
	}
	
}
