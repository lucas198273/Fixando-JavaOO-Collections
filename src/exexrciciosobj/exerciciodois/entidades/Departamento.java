package exexrciciosobj.exerciciodois.entidades;

public class Departamento {
    private String nome;

    public Departamento(){

    }
    public Departamento(String nome){
        this.nome =nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + "]";
    }
    
}
