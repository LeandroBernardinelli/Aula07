package Aula5_1;



public class AgeValidity {

   public static void main(String[] args) {    
java.util.Scanner keyboard = new java.util.Scanner(System.in);       

System.out.println("informe sua idade:");
int idade = keyboard.nextInt();
boolean drivingUnderAge; 
drivingUnderAge = false;
if (idade <= 17)
    System.out.println("Motorista é menor de idade");
if(idade> 18){
       System.out.println("Motorista habilitado");
   }
        


       System.out.println("Sua idade é:" + idade + " anos");
    }
}
       
    

