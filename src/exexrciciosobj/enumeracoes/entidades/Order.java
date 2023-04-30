package exexrciciosobj.enumeracoes.entidades;



import java.util.Date;

import exexrciciosobj.enumeracoes.entidadesenuns.OrderStatus;

public class Order {
    private Integer id;
    public Date moment;
    private OrderStatus status;
    
    public Order(){

    }
    public Order(Integer id, Date moment,OrderStatus status){
        this.id =id;
        this.moment = moment;
        this.status = status;

    }

 
    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
    public OrderStatus getStatus(){
        return status;
    }
    public Integer getId(){
        return id;
    }
    public Date getMoment(){
        return moment;
    }
    public void setStatus(OrderStatus status){
        this.status=status;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void setMoment(Date moment){
        this.moment=moment;
    }
}
