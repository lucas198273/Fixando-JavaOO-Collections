package exexrciciosobj.exercicioavulso.entidades;

import java.util.ArrayList;
import java.util.List;

public class Veiculos {

    
    private Carro carro;

    private List<Carro> listaCarrosPequenos = new ArrayList<>();

    public Veiculos(){

    }
    public Veiculos(Carro carro) {
        this.carro = carro;
    }
    public Carro getCarro(){
        return carro;
    }
    public void addCarro(Carro carro){
        listaCarrosPequenos.add(carro);
    }
    public List<Carro> getListaCarrosPequenos(){
        return listaCarrosPequenos;
    }
    @Override
    public String toString() {
        return "Veiculos :   "+  listaCarrosPequenos ;
    }
    
   
  


    
}
