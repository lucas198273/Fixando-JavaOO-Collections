package exexrciciosobj.exerciciodois.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exexrciciosobj.exerciciodois.entidadesenum.NivelFuncionario;

public class Funcionario {
    
    private String nome;
    private NivelFuncionario nivel;
    private double baseSalarial;

    private Departamento departamento;
    private List<ContratoFuncionario> contratos =  new ArrayList<>();
    
    public Funcionario(String nome, NivelFuncionario nivel, double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }
    public List<ContratoFuncionario> getContratos(){
         return contratos;
    }
   
    public String getNome() {
        return nome;
    }
    public NivelFuncionario getNivel() {
        return nivel;
    }
    public double getBaseSalarial() {
        return baseSalarial;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }
    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }
    // Metodo para consultar departamento
    public Departamento getDepartamento() {
        return departamento;
    }
    // Metodo para alterar departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    // Metodo para adicionar contrato
    public void addContrato(ContratoFuncionario contrato){
        contratos.add(contrato);
    }
    // Metodo para remover contrato
    public void removeContrato(ContratoFuncionario contrato){
        contratos.remove(contrato);

    }
     // metodo retorna quanto a pessoa ganhou em um ano ou um mes;
    public double rendimento(int ano, int mes){

      double sum = baseSalarial;
      Calendar cal = Calendar.getInstance();
        for(ContratoFuncionario x : contratos){
            cal.setTime(x.getData());
            int x_ano = cal.get(Calendar.YEAR);
            int x_mes = 1+ cal.get(Calendar.MONTH);// adiciona +1 pois o mes no calendar começa com zero
            if(ano == x_ano && mes == x_mes){
            sum += x.valorTotal();
        }
      
      } 
      return sum;
    }

        
    //     CODIGO ABAIXO RETORNA O VALOR DE TODOS OS CONTRATOS

     //for (ContratoFuncionario x : contratos) {
        //    sum +=  x.valorTotal();

        //}return sum;
    
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", nivel=" + nivel + ", baseSalarial=" + baseSalarial + "]";
    }

    
}
