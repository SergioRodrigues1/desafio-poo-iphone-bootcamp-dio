
public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// reprodutor musical
		iphone.tocarMusica();
		iphone.selecionarMusica("Someday");
		iphone.pausarMusica();
		
		// aparelho telefonico
		iphone.ligar("549484631");
		iphone.atenderChamada();
		iphone.iniciarCorreioVoz();
		
		// navegador de internet
		iphone.exibirPaginaInternet("www.espn.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
