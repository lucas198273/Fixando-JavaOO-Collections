package exexrciciosobj.exercicioavulso.entidades;

public class Caminhao {

    private String modelo;
    private int peso;

    private String rotaDestino;
    private  double consumoPorLitro;

    
    public Caminhao() {
    }


    public Caminhao(String modelo, int peso, String rotaDestino,double consumoPorLitro) {
        this.modelo = modelo;
        this.peso = peso;
        this.rotaDestino = rotaDestino;
        this.consumoPorLitro = consumoPorLitro;
    }


    public String getModelo() {
        return modelo;
    }
    
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getRotaDestino() {
        return rotaDestino;
    }
    public void RotaDestino(String rotaDestino) {
        this.rotaDestino = rotaDestino;
    }
    public double getConsumoPorLitro() {
        return consumoPorLitro;
    }
    public void setConsumoPorLitro(double consumoPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
    }
    

    
    
}
