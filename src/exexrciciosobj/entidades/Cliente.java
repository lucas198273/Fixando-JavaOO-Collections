package entidades;

public class Cliente {
	
	
	public String nome;
    private Long cpf;
    public  String origemCor;
    
    public Cliente (String nome, Long cpf, String origemCor){
    	this.nome = nome;
    	this.cpf = cpf;
    	this.origemCor = origemCor;
    }
    
    public String getNome(){
    	return nome;
    }
    public void setNome(String nome){
    	this.nome = nome;
    }
    public Long getCpf(){
    	return cpf;
    }
    public void setCpf(Long cpf){
    	this.cpf = cpf;
    }
    
    public void setOrigem(Long cpf){
    	this.cpf = cpf;
    }
    
    @Override
    public String toString(){
    	return "Nome "+nome + " Cpf: "+cpf+ " Origem Cor: "+origemCor;
    }
    

}
