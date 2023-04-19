package exerciciolist;

public class Funcionario {
	
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario(String nome , double salario, int id ) {
		this.nome= nome;
		this.salario = salario;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + "\nnome=" + nome + ", "+ "salario: "+salario+"]" ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void incrementaSalario(double porcentagem){
		salario += salario * porcentagem/100.00;
	}

	
}
	
