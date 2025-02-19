package reprodutor;
import interfaces.Reprodutor;

public class ReprodutorMusical implements Reprodutor {

	public void tocar() {
		System.out.println("Tocando música....");
		
	}


	public void pausar() {
		System.out.println("Música pausada.");
		
	}


	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música: " + musica);
		
	}
	

}
