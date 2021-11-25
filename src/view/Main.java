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
            opc = Integer.parseInt(JOptionPane.showInputDialog("Hist�rico\n"
            		+ "O que voc� gostaria de fazer?"
                    + "\n------------------------------------------------------"
                    + "\n1 - Inserir um novo endere�o"
                    + "\n2 - Remover o �ltimo endere�o visitado"
                    + "\n3 - Consultar o �ltimo  endere�o  visitado"
                    + "\n9 - Finalizar a aplica��o"));
            switch(opc){
                case 1: endereco = JOptionPane.showInputDialog("Digite o endere�o"
                		+ " a ser inserido no Hist�rico: ");
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
                case 9: System.out.print("\n\nAplica��o Finalizada!");
                        break;
                default: JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
            }
        }
        while(opc != 9);
	}

}
