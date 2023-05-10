package exexrciciosobj.exerciciocomentario.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exexrciciosobj.exerciciocomentario.entidades.Comentario;
import exexrciciosobj.exerciciocomentario.entidades.Post;

public class Programa {

    public static void main(String[] args)throws ParseException{
                                                    // este erro costuma acontecer na conversao de datas
        SimpleDateFormat mascaraSimples =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentario c1 = new Comentario("Eu sou argentino");
        Comentario c2 = new Comentario("Eu sou brasileiro");

        Post p1 = new Post( mascaraSimples.parse("15/08/2000 14:01:58"), "Eu amo sorvete", "ja provei todos os tipos de sorvete", 12);
        
        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);

    }
    
}
