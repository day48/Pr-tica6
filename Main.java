package br.com.redesocial;

import java.util.ArrayList;
import javax.swing.JOptionPane ;

public class Main {
    public static void main(String[] args) {
        String dataCriacao,nomeusuario,datanascimento,senha;
        String dataPublicacao,textoPublicacao,linkmidia;

        dataCriacao= JOptionPane.showInputDialog("Digite a data de criacao de rede social");
        nomeusuario= JOptionPane.showInputDialog("Digite o nome do usuaerio");
        datanascimento= JOptionPane.showInputDialog("Digite a data do usuario");
        senha= JOptionPane.showInputDialog("Digite a senha");

         RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeusuario,datanascimento,senha);
         Publicacao publi1;

         ArrayList<Publicacao>publi = new ArrayList<>();

         for (int i =0; i<3;i++){

             dataPublicacao =JOptionPane.showInputDialog("Digite a data da publicacao");
             textoPublicacao= JOptionPane.showInputDialog("Digite o texto");
             linkmidia = JOptionPane.showInputDialog("Digite o link");

             publi1 = new Publicacao( dataPublicacao,textoPublicacao,linkmidia);
             publi.add(publi1); //adiciona obj no arraylist.
             redeSocial.inserePublicacao(publi1); //adiciona o obj na rede social .

         }
         redeSocial.imprimePublicacoes();



    }
}