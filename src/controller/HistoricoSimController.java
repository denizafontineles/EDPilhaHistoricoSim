package controller;
import com.deniza.utils.pilha.string.Pilha;

public class HistoricoSimController {

	public HistoricoSimController() {
		super();
	}
	
	public boolean validar(String endereco) {
		String[] retorno = endereco.split("\\.");
		if(retorno[0].equals("http://www") && retorno.length > 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public void inserir(Pilha historico, String endereco) {
		if(validar(endereco) == true) {
			historico.push(endereco);
		} else {
			System.err.println("Endere�o <<"+endereco+">> inv�lido!");
		}
	}
	
	public void remover(Pilha historico) throws Exception {
		if(historico.isEmpty()) {
			throw new Exception("N�o h� endere�os para remover!");
		} else {
			String endereco = historico.pop();
			System.out.println("�ltimo endere�o visitado <<"+endereco+">> removido!");
		}
	}
	
	public void consultar(Pilha historico) throws Exception {
		if(historico.isEmpty()) {
			throw new Exception("N�o h� endere�os para consultar!");
		} else {
			String endereco = historico.top();
			System.out.println("�ltimo endere�o visitado: "+endereco);
		}
	}
	
}
