package exexrciciosobj.exerciciocomentario.entidades;



public class Comentario{
    
    private String text;

    public Comentario(){

    }
    public Comentario(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "Comentario [text=" + text + "]";
    }


    


}
