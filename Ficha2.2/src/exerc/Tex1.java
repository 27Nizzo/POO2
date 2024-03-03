//package exerc;
import java.util.Arrays;
import java.util.Scanner;

public class Tex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ex1 teste = new ex1();

        System.out.println("Exercicio: ");
        int exercicio = ler.nextInt();

        switch (exercicio) {
            case 1:
            System.out.println("Alinea: ");
            String alinea1 = ler.next();
            System.out.println("Numero de elementos: ");
            int numeroDeInteiros = ler.nextInt();
            
            int[] array = new int[numeroDeInteiros];
            System.out.println("Elementos do array: ");
            for(int i = 0; i < numeroDeInteiros; i++) {
                array[i] = ler.nextInt();
            }

            switch (alinea1) {
                case "a":
                int min = teste.minimo(array);
                System.out.println("min: " + min);
                ler.close();
                break;

                case "b": 
                int a = ler.nextInt();
                int b = ler.nextInt();
                int[] newArray = teste.entreIndices(array, a, b);
                System.out.println(Arrays.toString(newArray));
                ler.close();
                break;

                case "c": 
                System.out.println("Numero de elementos para o segundo array: ");
                int nB = ler.nextInt();
                int[] arrayB = new int[nB];
                System.out.println("Elementos para o segundo array: ");
                for(int i = 0; i < nB; i++) {
                    arrayB[i] = ler.nextInt();
                }
                int[] comuns = teste.comuns(array, arrayB);
                System.out.println(Arrays.toString(comuns));
                ler.close();
                break;
        
            }
           break;
            case 2: 
            // 
            break;
        
            default:
                break;
        }
    }

}
