import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       
        ex1 prog = new ex1();
        prog.executar();

    }

    public void executar () {

        float valor;
        String tipo;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Valor da temperatura e o seu tipo[C/F]: ");
        valor = ler.nextFloat();
        tipo = ler.next();
        convert(valor,tipo);
        ler.close();

    }
    
    
    
    
    
    
    public double convert(float v, String t){
        if((t.equals("F")) || (t.equals("f"))) {
            v = (v - 32) * 0.5556f;
            System.out.println("Temperatura em Celsius: " + v + "ºC");
        } else if ((t.equals("C")) || (t.equals("c"))) {
            v = (v * 1.8f) + 32; 
            System.out.println("Temperatura em Fahrenheit: " + v + "ºF");           
        } else {
            System.out.println("Not valid");
        }
        return v;
        
    }

    
        
}


/* Para compilar: javac nomeDoFicheiro.java
 * Para dar run: java nomeDoFicheiro 
 */