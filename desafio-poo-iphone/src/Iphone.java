import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone {
	private ReprodutorMusical rpm;
	private AparelhoTelefonico tel;
	private NavegadorInternet nav;
	
	public Iphone() {
		this.rpm = new ReprodutorMusical();
		this.tel = new AparelhoTelefonico();
		this.nav = new NavegadorInternet();
	}
	
	public void tocarMusica() {
		rpm.tocar();
	}
	
	public void pausarMusica() {
		rpm.pausar();
	}
	
	public void selecionarMusica(String musica) {
		rpm.selecionarMusica(musica);
	}
	
	public void ligar (String numero) {
		tel.ligar(numero);
	}
	
	public void atenderChamada() {
		tel.atender();
	}
	
	public void iniciarCorreioVoz() {
		tel.iniciarCorreioVoz();
	}
	
	public void exibirPaginaInternet(String url) {
		nav.exibirPagina(url);
	}
	
	public void adicionarNovaAba() {
		nav.adicionarNovaAba();
	}
	
	public void atualizarPagina() {
		nav.atualizarPagina();
	}
}
