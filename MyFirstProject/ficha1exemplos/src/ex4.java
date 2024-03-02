import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        int soma;
        int n;
        String resp;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Quantos numeros a somar? ");
            n = input.nextInt();
            soma = 0; 
            for (int i = 0; i < n; i++) {
                System.out.println("Valor: ");
                soma += input.nextInt();
            }
            System.out.println("O somatório é: " + soma);
            System.out.println("Quer repetir? [S/n]");
            
            resp = input.next();

        } while (resp.charAt(0) != 'n');
        input.close();
        System.out.println("Adeus");
    }
}