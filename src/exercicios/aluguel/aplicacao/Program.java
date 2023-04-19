package exercicios.aluguel.aplicacao;
import java.util.Locale;
import java.util.Scanner;

import exercicios.aluguel.entidades.Aluguel;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel aluguel = new Aluguel("Marvim", "rsmith548@gmail.com");
        Aluguel aluguel2 = new Aluguel("Diego", "emartinez211@hotmail.com");
        System.out.println(aluguel);
        System.out.println(aluguel2);


        System.out.println("\n\n");


        Aluguel[] vect = new Aluguel[10];

        System.out.println("Quantos Quartos seram alugados? ".toUpperCase());
        int n =sc.nextInt();
        --n;

        for(int i=0; i<=n; i++){
            System.out.println("Pedido #"+(i+1));
            System.out.println("Insira o nome do cliente ".toUpperCase());
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Insira o email: ".toUpperCase());
            String email = sc.nextLine();
            System.out.println("Digite o numero do QuartO".toUpperCase());
            int numeroQuarto = sc.nextInt();

            Aluguel aluguel3 = new Aluguel(nome, email);

            vect[numeroQuarto] = new Aluguel(nome, email);
        }
        for(int i=0; i <= 10 ; i++){
            if(vect[i] != null){
            System.out.println("Quarto "+i+" "+vect[i]);
        }}
    }
}

        