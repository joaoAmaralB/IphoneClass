public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {
    //Reprodutor Musical
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música: "+musica+".");
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música "+musica+" selecionada.");
    }

    //Aparelho Telefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+numero+".");
    }
    @Override
    public void atender() {
        System.out.println("Ligação atendida.");  
    }
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    //Navegador da Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+url+".");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar("Hey Jude");
        iphone.pausar();
        iphone.selecionarMusica("Yellow Submarine");
        System.out.println();

        iphone.ligar("61999999999");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        System.out.println();

        iphone.exibirPagina("Google");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
