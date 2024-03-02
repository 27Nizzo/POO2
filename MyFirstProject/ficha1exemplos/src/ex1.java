import java.util.Scanner;

public class ex1 {
    /*Maior de dois numeros: */
    public static void dizMaior (int n1, int n2) {
        if(n1 > n2) {
            System.out.println("O maior é: " + n1);
        } else {
            System.out.println("O maior é: " + n2);
        }
        
    }
    
    public static void main(String[] args) {
    int a, b;
    Scanner ler = new Scanner(System.in);
    System.out.println("Indique dois numeros inteiros: ");
    a = ler.nextInt();
    b = ler.nextInt();
    dizMaior(a,b);
    ler.close();
    }
}
