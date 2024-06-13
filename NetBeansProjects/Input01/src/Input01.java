
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        
        
        //Create a JOptionPane.
    String input = JOptionPane.showInputDialog("Digite algo:");
        //Store the input as a String and print it.
        System.out.println(input);          
        
        //Parse the input as an int.
    int input2 = Integer.parseInt("46");
    input2++;
        
        //Print its value +1
        System.out.println(input2);        
        
        //Tente criar uma caixa de diálogo, analisá-lo e inicializar um int em uma única linha.
        //Você deve ter apenas um ponto e vírgula (;) nesta linha.
     int input3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outra vez"));
     
        
        System.out.println(input3);

     
    }
}
