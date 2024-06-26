public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisas";
        String message = custName+" quer comprar duas "+itemDesc;        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preço = 12.74;
        double imposto = 3.92;
        int quantidade = 2;               
        // Declare and assign a calculated totalPrice
        double totalPrice = (preço + imposto) * quantidade;
        
        // Modify message to include quantity 
        
        System.out.println(  message);
        
        // Print another message with the total cost
        System.out.println("O custo total com o imposto é: $" + totalPrice);
    }    
}
