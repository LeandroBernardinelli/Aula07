package Aula5_1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare e inicialize uma variável booliana, outOfStock
        boolean outOfStock = false;
        
        // Se a quantidade for > 1, altere a variável da mensagem para 
         //indicar plural
         if (quantity > 1){
             message = message + "s";
         }
                 
        
        /* Se não houver um item no estoque, informe ao usuário que o
            item não está disponível. Else imprime a mensagem e o custo
            total */ 
        if (outOfStock){
            System.out.println(itemDesc+"isso está fora de estoque") ;
        }
        else{
            System.out.println(message);
            System.out.println("custo total com taxa" + total);
        }
        
    }
    
}


