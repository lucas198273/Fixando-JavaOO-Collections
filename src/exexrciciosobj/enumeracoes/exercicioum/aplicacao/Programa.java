package exexrciciosobj.enumeracoes.exercicioum.aplicacao;




import java.util.Date;

import exexrciciosobj.enumeracoes.exercicioum.entidades.Order;
import exexrciciosobj.enumeracoes.exercicioum.entidadesenuns.OrderStatus;

public class Programa {
    public static void main(String[] args){
    

    
    Order order = new Order(1, new Date(),OrderStatus.PENDING_PAYMENT);
    System.out.println(order);
    

    OrderStatus os01= OrderStatus.DELIVERED;

    OrderStatus os02 =OrderStatus.valueOf("DELIVERED");
    
    OrderStatus os03 = OrderStatus.PROCESSING;
    
    System.out.println(os01);
    System.out.println(os02);
    System.out.println(os03);






    


    }
    
}
