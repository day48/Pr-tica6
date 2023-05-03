package br.com.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    ArrayList<Publicacao> publicacoes = new ArrayList();

    void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    void imprimePublicacoes() {

        System.out.println("Total dde publicacoes: " + Publicacao.getContadorPublicacao());
        for (int i =0;i>publicacoes.size();i++){
            System.out.println("Data da publicacao" + publicacoes.get(i).getDataPublicacao());
            System.out.println("Texto da publicacao " + publicacoes.get(i).getTextoPublicacao());

        }
    }
}