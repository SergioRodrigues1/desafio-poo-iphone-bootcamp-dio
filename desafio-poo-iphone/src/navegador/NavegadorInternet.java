package navegador;
import interfaces.Navegador;

public class NavegadorInternet implements Navegador{

	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
		
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
		
	}

	public void atualizarPagina() {
		System.out.println("Página atualizada.");
		
	}
	

}
