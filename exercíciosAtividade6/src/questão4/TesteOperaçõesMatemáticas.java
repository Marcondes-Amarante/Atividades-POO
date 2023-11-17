package questão4;
import javax.swing.JOptionPane;

public class TesteOperaçõesMatemáticas {
	
	public static void menu() {
		
		int escolha=0;
		double resultado=0;
		
		do {
			
			System.out.println("operações matemáticas: ");
			
			System.out.println("1 - adição");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplicação");
			System.out.println("4 - divisão");
			System.out.println("0 - para sair");
			
			escolha = Integer.valueOf(JOptionPane.showInputDialog("escolha uma das opções acima: "));
		
			switch(escolha) {
			case 1:
				
				Adição novaSoma = new Adição();
				novaSoma.setA(Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor")));
				novaSoma.setB(Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor")));
				
				resultado = novaSoma.calcula(novaSoma.getA(), novaSoma.getB());
				System.out.println("resultado: "+resultado);
				
				break;
				
			case 2:
				
				Subtração novaSubtração = new Subtração();
				novaSubtração.setA(Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor")));
				novaSubtração.setB(Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor")));
				
				resultado = novaSubtração.calcula(novaSubtração.getA(), novaSubtração.getB());
				System.out.println("resultado: "+resultado);
				
				break;
			
			case 3:
				
				Multiplicação novaMultiplicação = new Multiplicação();
				novaMultiplicação.setA(Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor")));
				novaMultiplicação.setB(Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor")));
				
				resultado = novaMultiplicação.calcula(novaMultiplicação.getA(), novaMultiplicação.getB());
				System.out.println("resultado: "+resultado);
				
				break;
			
			case 4:
				
				Divisão novaDivisão = new Divisão();
				novaDivisão.setA(Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor")));
				novaDivisão.setB(Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor")));
				
				resultado = novaDivisão.calcula(novaDivisão.getA(), novaDivisão.getB());
				System.out.println("resultado: "+resultado);
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("selecione uma opção válida");
				escolha = Integer.valueOf(JOptionPane.showInputDialog("escolha uma das opções acima: "));
				menu();
			}
			
		}while(escolha==0);
	}
	
	
	public static void ExibirMenuNovamente() {
		
		String reiniciarMenu;
		
		do {
			reiniciarMenu = JOptionPane.showInputDialog("deseja efetuar novas operações: S|N:");
			
			if("S".equals(reiniciarMenu)){
				menu();
			}
		}while(!"N".equalsIgnoreCase(reiniciarMenu));
	}
	
	public static void main(String args[]) {
		
		menu();
		
		ExibirMenuNovamente();
	}
}
