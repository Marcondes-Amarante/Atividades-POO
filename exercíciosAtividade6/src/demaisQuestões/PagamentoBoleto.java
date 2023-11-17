package demaisQuestões;

public class PagamentoBoleto implements Pagamento{
	
int pagamento;
	
	public boolean EfetuarPagamento() {

		boolean valido;
		
		if(pagamento==1) {
			valido=true;
		}else {
			valido = false;
		}
		return valido;
	}
	
}
