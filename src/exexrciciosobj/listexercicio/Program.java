package exexrciciosobj.listexercicio;
 


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;





public class Program {
	
	public static void main(String[] args) {
		
		
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
		 Funcionario funcionario = listFuncionarios.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);
		 //Integer pos =  position(listFuncionarios, idsalario);
		 if(funcionario == null){
			System.out.println("Funcionario inexsitente".toUpperCase());
		 }
		 else {
			System.out.println("Entre com a Porcentagem que deseja aumentar no salario do cliente:".toUpperCase());
			double porcentagem = sc.nextDouble();
			funcionario.incrementaSalario(porcentagem);
		}
		System.out.println("Lista de funcionarios: ");

		for(Funcionario x : listFuncionarios){
			System.out.println(x);
		}

	  
	 sc.close();
	
	
	}
	//public static Integer position( List<Funcionario> listFuncionarios, int id){
	//	for(int i=0; i< listFuncionarios.size();i++){
	//		if(listFuncionarios.get(i).getId()==id){
	//			return id;
	//		}
	//		return null;
	//	}
	//}
	
}