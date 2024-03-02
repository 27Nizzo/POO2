import java.util.Scanner;


public class ex6m {

    public static void main(String[] args) {
        ex6m programa = new ex6m();
        programa.executar();
    }

    public void executar() {
        int n;

        Scanner ler = new Scanner(System.in);
        System.out.println("Queres calcular o fatorial de que numero: ");
        n = ler.nextInt();

        long result = factorial(n);
        System.out.printf("O fatorial de %d é %d\n", n, result);
    }
    
    public long factorial(int num) {
        if(num == 1) {
            return 1;
        } else {
            long fac = num * factorial(num - 1);
            System.out.println("Queres calcular o fatorial de que numero: ");
            return fac;
        }

    }

}
