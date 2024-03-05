package ficha2part2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {

    // Método para determinar o array com as Strings existentes (sem repetições)
    public static ArrayList<String> determinarArrayComStringsSemRepeticoes(ArrayList<String> arrayOriginal) {
        ArrayList<String> arraySemRepeticoes = new ArrayList<>();

        for (String str : arrayOriginal) {
            if (!arraySemRepeticoes.contains(str)) {
                arraySemRepeticoes.add(str);
            }
        }
        return arraySemRepeticoes;
    }
    //a) 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Tamanho do array: ");
        int n = ler.nextInt();
        ler.nextLine();  // Consumir a quebra de linha pendente

        ArrayList<String> arrayStrings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite uma string #" + (i + 1) + ": ");
            String inputString = ler.nextLine();
            arrayStrings.add(inputString);
        }

        System.out.println("\nArray original:");
        for (String str : arrayStrings) {
            System.out.println(str);
        }

        ArrayList<String> arraySemRepeticoes = determinarArrayComStringsSemRepeticoes(arrayStrings);

        System.out.println("\nArray sem repetições: ");

        for (String str : arraySemRepeticoes) {
            System.out.println(str);
        }
    }
}
