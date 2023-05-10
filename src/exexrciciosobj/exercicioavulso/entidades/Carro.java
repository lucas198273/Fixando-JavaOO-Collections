package exexrciciosobj.exercicioavulso.entidades;

public class Carro {

    private String modeloVeiculo;
    private int tabelaFip;
    private String cor;


    public Carro(){

    }
    public Carro( String modeloVeiculo, int tabelaFip, String cor){
        this.tabelaFip = tabelaFip;
        this.modeloVeiculo = modeloVeiculo;
        this.cor = cor;

    }
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public int getTabelaFip() {
        return tabelaFip;
    }
    public void setTabelaFip(int tabelaFip) {
        this.tabelaFip = tabelaFip;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }




    
}
