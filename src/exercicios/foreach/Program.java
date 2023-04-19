package exercicios.foreach;

public class Program {
    
    public static void main(String[] args){
        String[] vect = new String[]{"Lucas", "Diego","tales"};

        for(int i=0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------------------------");


        // Irei tarablhar com for each pois facilita ao 
        // acessar os elementos
        for(String obj : vect){
            System.out.println(obj);
        };

        System.out.println("---------------------------------");


        int[] vectNum = new int[]{1,5,10,74};
        for(int i=0; i<= vect.length; i++){
            System.out.println(vectNum[i]);
        }

        System.out.println("---------------------------------");

        for(int objNum : vectNum){

            System.out.println(objNum);
        }
    }
}
