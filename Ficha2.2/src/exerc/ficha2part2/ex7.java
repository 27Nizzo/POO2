package ficha2part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        int[] chaveNum = gerarNums(5,1,50);
        int[] chaveStar = gerarNums(2,1,9);

        System.out.println("Chave gerada: ");
        System.out.println("Números: " + Arrays.toString(chaveNum));
        System.out.println("Estrelas: " + Arrays.toString(chaveStar));

        int[] apostaNum = pedirNums("Aposta em 5 números(1-50): ", 5, 1, 50);
        int[] apostaStar = pedirNums("Aposta em 2 estrelas(1-9): ", 2,1,9);

        int numC = contarNumerosC(chaveNum, apostaNum);
        int starC = contarNumerosC(chaveStar, apostaStar);

        System.out.println("\nResultados: ");
        System.out.println("Números Corretos: " + numC);
        System.out.println("Estrelas Corretas: " + starC);

        for(int i = 0; i < 50; i++) {
            for(int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            System.out.println(Arrays.toString(chaveNum) + " + " + Arrays.toString(chaveStar));
        }
    }

    //Método para gerar números aleatórios: 
    public static int[] gerarNums(int quantidade, int min, int max) {
        int[] nums = new int[quantidade];
        Random randomNum = new Random();

        for(int i = 0; i < quantidade; i++) {
            nums[i] = randomNum.nextInt(max - min + 1) + min;
        }
        return nums;
    }

    //Método para pedir ao utilizador para introduzir números:
    private static int[] pedirNums(String mensagem, int quantidade, int min, int max) {
        Scanner ler = new Scanner(System.in);
        int[] nums = new int[quantidade];
        System.out.println(mensagem);

        for(int i = 0; i < quantidade; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            nums[i] = ler.nextInt();
        }
        return nums;
    }

    //Método para contar quantos números coicidem entre duas listas: 
    private static int contarNumerosC(int[] chave, int[] aposta) {
        int contador = 0;
    
        for (int numAposta : aposta) {
            for (int numChave : chave) {
                if (numAposta == numChave) {
                    contador++;
                    break; // Sai do loop interno se encontrar um número correspondente
                }
            }
        }
        return contador;
    }
    
}
