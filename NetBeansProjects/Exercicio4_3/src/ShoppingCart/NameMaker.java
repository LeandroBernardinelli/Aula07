package ShoppingCart;

import javax.swing.JOptionPane;


public class NameMaker {
    String nome, nomeDoMeio, sobreNome, nomeCompleto;
  
    public static void main(String args[]){
String nome = JOptionPane.showInputDialog("Digite seu primeiro nome:");        
String nomeDoMeio = JOptionPane.showInputDialog("Digite seu nome do meio:"); 
String sobreNome = JOptionPane.showInputDialog("Digite seu sobrenome");
String nomeCompleto = nome + nomeDoMeio + sobreNome;

        System.out.println(nome +" "+ nomeDoMeio +" "+  sobreNome);

    }
    
}
