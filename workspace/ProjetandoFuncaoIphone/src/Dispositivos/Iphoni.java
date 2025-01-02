package Dispositivos;


import Funcionalidades.ReprodutorMusical;
import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorNaInternet;

public class Iphoni implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando Musica");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para telefone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}
