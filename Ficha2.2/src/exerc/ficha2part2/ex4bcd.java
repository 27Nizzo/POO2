package ficha2part2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4bcd {
    
    // Metodo para determinar a maior String Inserida: b) 
    public static String determinarMaiorString(ArrayList<String> arrayOriginal) {
        if(arrayOriginal.isEmpty()) {
            return null;
        }

        String maiorString = arrayOriginal.get(0);

        for(String str : arrayOriginal) {
            if(str.length() > maiorString.length()) {
                maiorString = str; 
            }
        }
        return maiorString;
    }

    // Metodo determinar um array com as Strings que aparecem mais que uma vez: c)
    
    

    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Tamanho do array: ");
        int n = ler.nextInt();
        ler.nextLine();

        ArrayList<String> arrayStrings = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Digite uma string #" + (i+1)+ ":");
            String inputString = ler.nextLine();
            arrayStrings.add(inputString);
        }
        //b)
        String maiorString = determinarMaiorString(arrayStrings);
        System.out.println("\nMaior string inserida: " + maiorString);
    }
    
}
