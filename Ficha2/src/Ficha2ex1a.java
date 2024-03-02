import java.util.Scanner;

public class Ficha2ex1a {

    public static void main(String[] args) {
        Ficha2ex1a prog = new Ficha2ex1a();
        prog.exe();
    }

    public void exe() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tamanho do array:");
        int size = ler.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Digite o valor para a posição " + i + ":");
            array[i] = ler.nextInt();
        }

        System.out.println("Valores do array:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        int valorMinimo = minimo(array);
        System.out.println("O valor mínimo no array é: " + valorMinimo);

        ler.close();
    }

    public int minimo(int[] array) {
        if (array.length < 1) {
            return 1;
        }

        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
