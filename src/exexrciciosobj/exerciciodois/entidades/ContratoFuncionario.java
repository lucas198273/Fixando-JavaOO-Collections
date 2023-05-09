package exexrciciosobj.exerciciodois.entidades;

import java.util.Date;


public class ContratoFuncionario {
    private Date data; 
    private double valorporhora;
    private int horas;

    public ContratoFuncionario(){

    }
    public ContratoFuncionario(Date data,double valorporhora, int horas){
        this.data = data;
        this.valorporhora= valorporhora;
        this.horas=horas;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValorporhora() {
        return valorporhora;
    }
    public void setValorporhora(double valorporhora) {
        this.valorporhora = valorporhora;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double valorTotal(){
        return valorporhora * horas;
    }
   
    @Override
    public String toString() {
        return  "ContratoFuncionario [data=" + data + ", valorporhora=" + valorporhora + ", horas=" + horas + "]";
    }
    
   
    
}
