/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5_2;
import java.util.Scanner;
/**
 *
 * @author leandro
 */
public class WatchMovie {
    public static void main(String[] args) {
        int classeFilme = 5;
        int preço;
        Scanner in = new Scanner(System.in);
        //O preço do ingresso é maior ou igual a US$ 12
        //A classificação do filme é igual a 5
        System.out.println("Insira o preço do ingresso de cinema \n");
        preço = in.nextInt();
        
        if (preço >=12 && classeFilme == 5) {        
        System.out.println("Estou interessado em assistir o filme.");} 
        
        else {   
            
        System.out.println("Não estou interessado em assistir o filme.");}
        
        
        
    }
    
}
