public class Casting01 {
    public static void main(String[] args) {
        // declarar e inicializar um byte com um valor de 128
        //byte valor = 128;
        // Observar a queixa dos Netbeans        
        
        
        // declarar e inicializar um short com um valor de 128
    short valor = 128;    
    
    
        // Crie uma declaração de impressão que lança este short para um byte
    byte valor1;    
    valor1 = (byte)valor;
System.out.println(valor1);    
      

        // declarar e inicializar um byte com um valor de 127
    byte x = 127;     
        
        // Adicione 1 a esta variável e imprimi -la
    x = ++x; 
    
System.out.println(x);
      
        // Adicione 1 a esta variável novamente e imprima -a novamente
    x = ++x;
        
        
System.out.println(x);    
        
        
        
        
    }    
}
