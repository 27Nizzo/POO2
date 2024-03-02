import java.util.Scanner;


public class ex2 {
    /* Diz qual é o maior mas com a classe Math */

    public static void dizMaior(int n1, int n2) {
        System.out.println("O maior é: "+ Math.max(n1, n2)); /* classe Math.max(n1,n2) calcula logo qual é o maior entre dois numeros */
    }
     public static void main(String[] args) {
        int a, b;   
        Scanner ler = new Scanner(System.in);
        System.out.println("Indique dois numeros inteiros: ");
        a = ler.nextInt();
        b = ler.nextInt();
        dizMaior(a, b);
        ler.close();
     }
    
}
