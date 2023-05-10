package exexrciciosobj.exercicioavulso.principal.entidades;


import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exexrciciosobj.exercicioavulso.entidades.Carro;
import exexrciciosobj.exercicioavulso.entidades.Veiculos;



public class programa {
    
    /**
     * 
     */
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    
    
    
    
    System.out.println("PARA CADASTRAR CARRO DIGITE 1: ");
    System.out.println("PARA CADSTRAR CAMINHAO DIGITE 2: ");
    int tipo = sc.nextInt();

    Veiculos veiculos = new Veiculos(null);

    System.out.println("Quantos veiculos voçe deseja cadastrar: ");
    int n = sc.nextInt();
    n--;
   if(tipo ==  1){
   for(int i =0;i <=n ;i++){
      System.out.println("Cadastro do Veiculo #"+(i+1));
      System.out.println("Informe o modelo: ");
      String modeloVeiculo = sc.nextLine();
      sc.nextLine();
      System.out.println("Cor do veiculo");
      String cor = sc.nextLine();
      System.out.println("Valor da Fip do veiculo: ");
      int tabelaFip = sc.nextInt();
      sc.nextLine();
      Carro carro= new Carro(modeloVeiculo, tabelaFip, cor);
      veiculos = new Veiculos(carro);
      veiculos.addCarro(carro);   // carro adicionado dentro de uma Lista Array 


    }
  }
  
    System.out.println(veiculos.getListaCarrosPequenos());
  }
  
  

       
  }


    
  

   
   




    






    
    

