package exexrciciosobj.enumeracoes.aplicacao;




import java.util.Date;

import exexrciciosobj.enumeracoes.entidades.Order;
import exexrciciosobj.enumeracoes.entidadesenuns.OrderStatus;

public class Programa {
    public static void main(String[] args){
    

    
    Order order = new Order(1, new Date(),OrderStatus.PENDING_PAYMENT);
    System.out.println(order);
    

    OrderStatus os01= OrderStatus.DELIVERED;
    
    OrderStatus os02 =OrderStatus.valueOf("DELIVERED");





    


    }
    
}
