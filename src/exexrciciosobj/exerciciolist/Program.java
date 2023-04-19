


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String frase = "ola";
	
	List<Funcionario> listFuncionarios = new ArrayList<>();
	
	
	System.out.println("quantos funcionarios voçe quer adicionar: ".toUpperCase());
	int n = sc.nextInt();
	n--;
	
	for( int i=0; i <= n; i++){
		 System.out.println();
		 System.out.println("Funcionario  #" + (i + 1));
         System.out.println("Insira o id do funcionario: ".toUpperCase());
         int id= sc.nextInt();
         
         System.out.println("Insira  o nome do funcionario : ".toUpperCase());
         sc.nextLine();
         String nome = sc.nextLine();
         
         System.out.println("Digite o salario : ".toUpperCase());
         double salario = sc.nextDouble();
         
          
         
         Funcionario funcionario = new Funcionario(nome, salario, id);
         listFuncionarios.add(funcionario);
	}
	
	System.out.println("insira o id do funcionario que deseja alterar o salario: ".toUpperCase());
	int idsalario = sc.nextInt();
	
    Integer posicao = new Posicao();
	
	sc.close();
	
	}
	public Integer Posicao(List<Funcionario> list, int id){
	
		for(int i=0; i<=list.size(); i++){
			if(list.get(i).getId() == id) {
				return i;
			}
			else {
				return -1;
			}
		}
	
 
   }
}
