public class IPHONE {
    public static void main(String[] args) throws Exception {
    
        ReprodutorMusical music = new ReprodutorMusical();
        music.tocar();
        music.pausar();
        music.selecionarMusica();
    
        AparelhoTelefonico phone = new AparelhoTelefonico();
        phone.atender();
        phone.ligar();
        phone.correioVoz();

        NavegadorInternet browser = new NavegadorInternet();
        browser.exibirPagina();
        browser.novaAba();
        browser.f5();
    }
}


