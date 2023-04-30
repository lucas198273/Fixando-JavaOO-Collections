package exexrciciosobj.pedido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
	public static void main(String[] args){
		
		 List<String> list = new ArrayList<>();
				list.add("Dhonatan");
				list.add("Veronica");
				list.add("Marcus");
				list.add("Ana laura");
				list.add("Fernanada");
				list.add("Geralda");
				System.out.println("Quantidade de elementos: "+list.size()); 
				
				for(String x : list){
					System.out.println(x);
				}
				System.out.println("Fernanada");
				list.add(2, "Matheus" );
				
				list.remove("Geralda");
				
				System.out.println("\n\n");
				
				list.remove(1);
				list.remove(3);
				
				for(String x : list){
					System.out.println(x);
				}
				System.out.println("\n\n");
				list.remove(1);
				System.out.println("index of "+ list.indexOf("Marcus"));
				for(String x : list){
					
					System.out.println(x);
				}
				
				System.out.println("============================================================");
				System.out.println("Trabalhando com index: ");
				System.out.println("index of "+ list.indexOf("Dhonatan"));
				System.out.println("index of "+ list.indexOf("Marcus"));
				System.out.println("index of "+ list.indexOf("Fernanda"));
				
				for(String x: list){
					System.out.println(x);
				}
				System.out.println("============================================================");
				
				
				
				List<Integer> numeros = new ArrayList<>();
				
				numeros.add(0,5);
				numeros.add(1,6);
				numeros.add(2,7);
				numeros.add(3,8);
				numeros.add(4,9);
				

				
				numeros.removeIf(n -> n % 2 == 0);

				System.out.println(numeros); 
				System.out.println(" Remoção filtrada pela letra inicial: ".toUpperCase());
				list.removeIf(x -> x.startsWith("M"));
				list.removeIf(x -> x.startsWith("D"));
				list.removeIf(x -> x.startsWith("F"));
				
				list.add("jonas");
				list.add("katia");
				list.add("keven");
				list.add("priscila");
				list.add("oliveira");
				list.add("orlando");
				list.add("tadeu");
				list.add("mateus");
				list.add("mario");
				list.add("maria");
				list.add("mario");
				list.add("maria");
				list.add("mourao");
				list.add("maria cardoso");
				
				for(String x: list){
					System.out.println(x);
				}
				
				
				System.out.println("Verificando se alista esta vazia: "+list.isEmpty());
				
		        System.out.println("\n\n Filtrando Lista: ");
		        List<String> listFilterM = list.stream().filter(x -> x.startsWith("m", 0)).collect(Collectors.toList());
		        
		        for(String x : listFilterM){
		        	System.out.println("Lista M: "+x);
		        }
		        List<String> listFilterO = list.stream().filter(x -> x.startsWith("o", 0)).collect(Collectors.toList());
		        for(String x : listFilterO){
		        	System.out.println("Lista O: "+x);
		        }
		        List<String> listFilterK = list.stream().filter(x -> x.startsWith("k", 0)).collect(Collectors.toList());
		        for(String x : listFilterK){
		        	System.out.println("Lista K: "+x);
		        }
			  
				System.out.println("\n\n");
		        List<Integer> listNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		        List<Integer> numerosParesMultiplicadosPorDois = numeros.stream()
		            .filter(numero -> numero % 2 == 0) 
		            .map(numero -> numero * 2) 
		            .collect(Collectors.toList());

		        System.out.println(numerosParesMultiplicadosPorDois);
		        
		        System.out.println("\n\n");
		        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana", "Carlos");
		        
		        String nomesfiltro = nomes.stream().filter(x -> x.startsWith("P",0)).findFirst().orElse(null);
		        System.out.println(nomesfiltro);
		        
		        
		        

		        String nomesConcatenados = nomes.stream()
		            .reduce((nome1, nome2) -> nome1 + ", " + nome2) 
		            .orElse(""); 

		        System.out.println(nomesConcatenados); 
		        
		        String nomesfiltro2 = nomes.stream().filter(x -> x.startsWith("M",0)).findFirst().orElse(null);
		        System.out.println(nomesfiltro2);
		        String nomesfiltro3 = nomes.stream().filter(x -> x.startsWith("M",0)).findFirst().orElse(null);
		        System.out.println(nomesfiltro3);
		        
		        System.out.println("\n\n");
			    Scanner sc = new Scanner(System.in);
			    
			    String nome ;
				Long cpf;
				String origemCor;
				int id;
				 List <Cliente> clientes = new ArrayList<>(); 
				
					
			      
				System.out.println("Quantas Pessoas Vao ser adicionadas: ");
				int numPessoas = sc.nextInt();
				sc.nextLine(); 
				
				
				
				
				
			      for (int i = 0; i <= numPessoas; i++) {
			            System.out.println("Pedido #" + (i + 1));
			            System.out.println("Insira o nome do cliente: ");
			             nome = sc.nextLine();
			             sc.nextLine();
			             
			            System.out.println("Insira sua Origem Cor: ");
			             origemCor = sc.nextLine();
			            System.out.println("Digite o numero do ID: ");
			             id = sc.nextInt();
			            sc.nextLine(); 
			            System.out.println("Insira o cpf: ");
			             cpf = sc.nextLong();
			            sc.nextLine(); 

			            Cliente cliente = new Cliente(nome, cpf, origemCor);
			            clientes.add(cliente); 
			        }

			        for (int i = 0; i <= clientes.size(); i++) { 
			        	System.out.println(clientes.get(i));
			        }
			      }
	
	}

			
							
					
				
				
				
				
			
				
				
				
				
				
		
