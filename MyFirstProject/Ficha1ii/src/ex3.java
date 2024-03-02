import java.util.Scanner;

public class ex3 {
    
    public static String criaDescricaoDeConta(String nome, double saldo, String gen) {
        
        if(gen.equals("M")) {
            System.out.println("O " + nome + " tem o saldo de " + saldo + "$");
        } else if(gen.equals("F")) {
            System.out.println("A" + nome + " tem o saldo de " + saldo + "$");

        } else if(gen.equals("Outro") || gen.equals("outro") || gen.equals("O") || gen.equals("o")) {
            System.out.println("M_t_-te sfv broski");

        } else {
            System.out.println("Nao me chateies a puta da cabeça");
        }
        return gen;

    }
    
    
    
    public static void main(String[] args) {
         ex3 prog = new ex3();
         prog.executar();
    }

    public void executar() {

    double saldo;
    String nome;
    String gen;

    Scanner ler = new Scanner(System.in);

    System.out.println("Genero[M/F/O]: ");
    gen = ler.nextLine();
    System.out.println("Nome: ");
    nome = ler.nextLine();
    System.out.println("Saldo: ");
    saldo = ler.nextDouble();

    criaDescricaoDeConta(nome,saldo, gen);
    ler.close();

    }
}
