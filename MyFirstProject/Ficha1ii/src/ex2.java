import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        ex2 prog = new ex2();
        prog.executar();
    }

    public void executar() {

        int n1, n2;

        Scanner ler = new Scanner(System.in);
        System.out.println("Indique dois valores para saber qual deles é o maior: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        maximo(n1, n2);
        ler.close();
    }


    public static void maximo(int a, int b) {

        if(a > b) {
            System.out.println("O maior é: " + a); 
        } else if(a < b) {
            System.out.println("O maior é: " + b);
        } else {
            System.out.println("Not valid or equal!");
        }
        
    }
    
}
