import java.util.Scanner;

public class ex4m {
    public static void main(String[] args) {
        ex4m prog = new ex4m(); // Criação de um instancia para nao ser preciso do metodo static
        prog.executar();
    }

    public void executar() {
        double valorEmEuros;
        double taxaDeConversao;

        Scanner ler = new Scanner(System.in);

        System.out.println("Valor em euros: ");
        valorEmEuros = ler.nextDouble();
        taxaDeConversao = 0.86; // taxa de conversao de euros para libras

        eurosParaLibras(valorEmEuros, taxaDeConversao);
    }

    public double eurosParaLibras (double valor, double taxaConversao) {
        double valorEmLibras = valor * taxaConversao;
        System.out.println("Conversão para libras:" + valorEmLibras + "£");
        return valorEmLibras;
    }
}
