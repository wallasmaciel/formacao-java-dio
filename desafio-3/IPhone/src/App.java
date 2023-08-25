public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();
        try {
            musica(iphone);
            telefone(iphone);
            navegador(iphone);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void musica(ReprodutorMusical reprodutorMusical) throws Exception {
        if (reprodutorMusical == null) throw new Exception("Invalid object \"reprodutorMusica\"");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
    }

    static void telefone(AparelhoTelefonico aparelhoTelefonico) throws Exception {
        if (aparelhoTelefonico == null) throw new Exception("Invalid object \"aparelhoTelefonico\"");
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    static void navegador(NavegadorInternet navegadorInternet) throws Exception {
        if (navegadorInternet == null) throw new Exception("Invalid object \"navegadorInternet\"");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
