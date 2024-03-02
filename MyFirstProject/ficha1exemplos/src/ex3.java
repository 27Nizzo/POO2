import java.util.Scanner;

public class ex3 {
    public static void main(String [] args) {
        int soma = 0;
        Scanner input = new Scanner (System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor: ");
            soma += input.nextInt();
        }
        System.out.println("O soamtório da soma é " + soma);
        input.close();
    }
    
}
