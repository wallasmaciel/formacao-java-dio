public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do navegador.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando do aparelho telefonico.");
    }

    @Override
    public void atender() {
        System.out.println("Atender o aparelho telefonico.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar o correio de voz telefonico.");
    }
}
