package exexrciciosobj.exerciciodois.aplicacao;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exexrciciosobj.exerciciodois.entidades.ContratoFuncionario;
import exexrciciosobj.exerciciodois.entidades.Departamento;
import exexrciciosobj.exerciciodois.entidades.Funcionario;
import exexrciciosobj.exerciciodois.entidadesenum.NivelFuncionario;

public class programa {
    public static void main(String[] args) throws ParseException{

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in );        

    // Mascara para data
    SimpleDateFormat formatoDataSimples = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Entre com o departamento: ");
    String departamento = sc.nextLine();
    
   

    System.out.println("Dados do Funcionario: ");
    System.out.println("Nome".toUpperCase());
    String nomeFuncionario = sc.nextLine();
    System.out.println("nivel do funcionario: ".toLowerCase());
    String nivel = sc.nextLine().toUpperCase();
    System.out.println("Base salarial: ");
    double baseSalarial = sc.nextDouble();

    Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivel), baseSalarial, new Departamento(departamento));

        System.out.println("Quantos contratos voçe deseja registrar: ");
        int n = sc.nextInt();
        

        for(int i=1;i<=n;i++){
            System.out.println("ENTRE COM OS DADOS DO CONTRATO "+i);
            System.out.println(" Data (DD/MM/YYYY): ");
            Date dataContrato = formatoDataSimples.parse(sc.next());
            System.out.println("Valor por Hora: ");
            int valorporhora = sc.nextInt();
            System.out.println("Quantidades de horas trabalhadas: ");
            int horas = sc.nextInt();
            ContratoFuncionario contrato = new ContratoFuncionario(dataContrato, valorporhora, horas);
            funcionario.addContrato(contrato);

        }
        System.out.println();
        System.out.println("Entre com o mes e ano para calcular salario: (MM/YYYY)");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2)) ;
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Departamento: "+ funcionario.getDepartamento().getNome());
        System.out.println("Renda do mes "+mesAno+" : "+String.format("%.2f", funcionario.rendimento(ano, mes)));

       


     sc.close();

    }
}
