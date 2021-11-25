package view;
import javax.swing.JOptionPane;
import com.deniza.utils.pilha.string.Pilha;
import controller.HistoricoSimController;

public class Main {
	
	public static void main(String[] args) {
		Pilha historico = new Pilha();
		HistoricoSimController hCont = new HistoricoSimController();
		
		String endereco = "";
		
		int opc=0;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Histórico\n"
            		+ "O que você gostaria de fazer?"
                    + "\n------------------------------------------------------"
                    + "\n1 - Inserir um novo endereço"
                    + "\n2 - Remover o último endereço visitado"
                    + "\n3 - Consultar o último  endereço  visitado"
                    + "\n9 - Finalizar a aplicação"));
            switch(opc){
                case 1: endereco = JOptionPane.showInputDialog("Digite o endereço"
                		+ " a ser inserido no Histórico: ");
                		hCont.inserir(historico, endereco);
                        break;
                case 2: try {
							hCont.remover(historico);
							} catch (Exception e) {
							e.printStackTrace();
						}
                        break;
                case 3: try {
							hCont.consultar(historico);
						} catch (Exception e) {
							e.printStackTrace();
						}
		                break;
                case 9: System.out.print("\n\nAplicação Finalizada!");
                        break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
        while(opc != 9);
	}

}
