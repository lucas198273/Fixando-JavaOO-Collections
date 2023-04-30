package exexrciciosobj.horaedata;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        
        Scanner sc =new  Scanner(System.in);
        

        // Data customizada fora do padrao
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("HH:mm");
        
        //Instant e Local
        LocalDateTime d01 = LocalDateTime.now();
        // Instant vem com fuso horario padrao de londres;
        Instant d02 = Instant.now();
        Instant d002 = Instant.parse("2022-07-20T01:25:48-01:00");
        LocalDate d03 = LocalDate.parse("2022-07-20");
        LocalDateTime d04 = LocalDateTime.parse("2022-07-20T01:25:48");
        Instant d05 = Instant.parse("2022-07-20T01:25:48Z");
        LocalDate d06 = LocalDate.parse("25/05/2000",fm1);
        LocalDate d07 = LocalDate.of(2000, 4, 7);
        LocalDateTime d08 = LocalDateTime.of(2005, 6, 5, 5, 45, 58);
        
        

        
        System.out.println("Horario atual : ".toUpperCase()+d01);
        System.out.println("Horario atual em londres: ".toUpperCase()+d02);
        System.out.println("Data de Nascimento: ".toUpperCase()+d03);
        System.out.println("Data De Nascimento e horario :".toUpperCase()+d04);
        System.out.println("Uma hora apos o nascimaneto".toUpperCase()+d002);
        System.out.println("D05: ".toUpperCase()+d05);
        System.out.println("Data customizada: ".toUpperCase()+d06);
        System.out.println("Data aleatoria: ".toUpperCase()+d07);
        System.out.println("data aleatoria 2 : ".toUpperCase()+d08);
        //System.out.println("Dia Aleatorio: ".toUpperCase()+d07);
        //System.out.println("Dia aleatorio Mais Horario ".toUpperCase(null)+d08);



        


        System.out.println("quantas pessoas seram adicionadas: ".toUpperCase());
        int n = sc.nextInt();










        sc.close();
    }
    
}
