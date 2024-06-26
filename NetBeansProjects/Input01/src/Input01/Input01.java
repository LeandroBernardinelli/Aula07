
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        
        
        //Create a JOptionPane.
    String input = JOptionPane.showInputDialog("Digite algo:");
        //Store the input as a String and print it.
        System.out.println(input);          
        
        //Parse the input as an int.
        //Print its value +1
        System.out.println((Integer.parseInt(input)+ 1));        
        
        //Tente criar uma caixa de diálogo, analisá-lo e inicializar um int em uma única linha.
        //Você deve ter apenas um ponto e vírgula (;) nesta linha.
     int input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
     
        
        System.out.println(input2);

     
    }
}
