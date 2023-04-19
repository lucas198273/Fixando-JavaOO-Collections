package exercicios.aluguel.entidades;
public class Aluguel {

    private String nome;
    private String  email;

    public Aluguel(String nome , String email){
        this.nome = nome;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return "Aluguel: "+"Nome: "+nome+ "\n Email: "+email;
    }
    
}
