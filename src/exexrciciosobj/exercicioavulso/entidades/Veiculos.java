package exexrciciosobj.exercicioavulso.entidades;

import java.util.ArrayList;
import java.util.List;

public class Veiculos {
    
    private Caminhao caminhao ;
    private Carro carro;

    private List<Caminhao> listaVeiculosPesados = new ArrayList<>(); 
    private List<Carro>listaVeiculosPequenos = new ArrayList<>();
    
    public Veiculos(Caminhao caminhao, Carro carro) {
        this.caminhao = caminhao;
        this.carro = carro;
     
    }
    public Caminhao getCaminhao(){
        return caminhao;
    }
    public void addCaminhao(Caminhao camihao){
        listaVeiculosPesados.add(camihao);
    }
    public Carro getCarro(){
        return carro;
    }
    public void addCarro(Carro carro){
        listaVeiculosPequenos.add( carro);
    }


    
}
