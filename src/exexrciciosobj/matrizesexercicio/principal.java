package exexrciciosobj.matrizesexercicio;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Determine quantas linhas e colunas nossa matriz tera: ");
        int n = sc.nextInt();
        int[][] mat = new int [n][n];

        for(int i=0 ; i<mat.length; i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] =sc.nextInt();
            }
        }
        System.out.println("apresentação diagonal da matriz".toUpperCase());
        for(int i=0;i<mat.length;i++){
            System.out.println(mat[i][i] + " ");
        }
        int count = 0;
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
               if(mat[i][j] < 0){
                 count++;  
                }
            }
        
        }
        System.out.println("Numeros Negativos Digitados:  "+ count);
        System.out.println("Fim");



        sc.close();

    }
    
}
