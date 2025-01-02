package Dispositivos;

public class TesteIphone {
    public static void main(String[] args) {
        Iphoni meuIphone = new Iphoni();
        System.out.println("Testando o aparelho Telefonico");
            meuIphone.ligar();
            meuIphone.atender();
            meuIphone.iniciarCorreioVoz();
            System.out.println("---------------------------------------------------------------------");
        System.out.println("Testando Navegador de internt");
            meuIphone.adicionarNovaAba();
            meuIphone.atualizarPagina();
            meuIphone.exibirPagina();
            System.out.println("---------------------------------------------------------------------");
        System.out.println("Testando Reprodutor Musical");
            meuIphone.selecionarMusica();
            meuIphone.tocarMusica();
            meuIphone.pararMusica();
        }
}
