import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        double n1;
        double n2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        n1 = ler.nextDouble();
        System.out.println("Segundo numero: ");
        n2 = ler.nextDouble();

        double mediaResult = media(n1, n2); 
        ordemD(n1, n2, mediaResult); 
    }

    public static double media(double n1, double n2) {
        double mediaC = (n1 + n2) / 2;
        System.out.printf("A media de %.2f e %.2f e de %.2f\n", n1, n2, mediaC); // Use printf for formatted output
        return mediaC;
    }

    public static void ordemD(double n1, double n2, double mediaResult) {
        if (n1 > n2) {
            System.out.println(n1 + " > " + n2);
        } else if (n1 < n2) { // Corrected the condition
            System.out.println(n2 + " > " + n1);
        } else {
            System.out.println(n1 + " = " + n2);
        }
    }
}