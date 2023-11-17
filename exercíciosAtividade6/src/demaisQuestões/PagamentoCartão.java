package demaisQuestões;

public class PagamentoCartão implements Pagamento {
	
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
