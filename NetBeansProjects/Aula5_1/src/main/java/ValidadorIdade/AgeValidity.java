package ValidadorIdade;

import java.util.Scanner;

public class AgeValidity {

   public static void main(String[] args) {    
java.util.Scanner keyboard = new java.util.Scanner(System.in);       

System.out.println("informe sua idade:");
int idade = keyboard.nextInt();
boolean drivingUnderAge; 
drivingUnderAge = false;
if (idade <= 18)
    System.out.println("Motorista é menor de idade");
        


       System.out.println("Sua idade é:" + idade);
    }
}
       
    

