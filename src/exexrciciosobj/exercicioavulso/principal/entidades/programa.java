package exexrciciosobj.exercicioavulso.principal.entidades;

import java.util.Locale;
import java.util.Scanner;



public class programa {
    
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);



    System.out.println("Qual tipo de veiculo deseja cadastrar: ");
    System.out.println("PARA CADASTRAR CARRO DIGITE 1: ");
    System.out.println("PARA CADSTRAR CAMINHAO DIGITE 2: ");
    int tipo = sc.nextInt();
    
    if(tipo == 1){
        System.out.println("Voçe optou em cadastra um Carro: ");
        System.out.println("Informe o modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Valor da Fip do veiculo: ");
        int tabelaFip = sc.nextInt();
        System.out.println("Cor do veiculo");


    }
    if(tipo == 2){
        System.out.println("caminhao");

    }


  //  System.out.println("Quantos veiculos voçe deseja cadastrar: ");
   // int n = sc.nextInt();
    
  //  for(int i=0;i<n;i++){



    //}



    sc.close();
    }
}
