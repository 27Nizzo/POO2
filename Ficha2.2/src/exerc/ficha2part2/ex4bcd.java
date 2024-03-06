package ficha2part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    public static ArrayList<String> determinarStringsRepetidas(ArrayList<String> arrayOriginal) {
        ArrayList<String> arrayRepetidos = new ArrayList<>();
        HashMap<String, Integer> contador = new HashMap<>();
        /* Um HashMap em Java é uma estrutura de dados que permite armazenar pares chave-valor. Cada chave é única e mapeada para um valor correspondente. 
        Isso permite que você 
        associe dados (valores) a identificadores (chaves) de maneira eficiente, permitindo recuperação rápida dos valores com base nas chaves
        */ 

        for(String str : arrayOriginal) {
            contador.put(str, contador.getOrDefault(str, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : contador.entrySet()) {
            if(entry.getValue() > 1) {
                arrayRepetidos.add(entry.getKey());
            }
        }
        return arrayRepetidos;
    }    

    //Metodo para determinar quantas vezes  um String ocorre no array: d)
    public static int contarOcorrencias(String strPedido, ArrayList<String> arrayOriginal) {
        int contador = 0; 

        for(String str : arrayOriginal) {
            if (str.equals(strPedido)) {
                contador++;
            }
        }
        return contador; 
    }
    

    

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

        //c) 
        ArrayList<String> arrayRepetidos = determinarStringsRepetidas(arrayStrings);
        System.out.println("\nStrings que aparecem mais que uma vez: ");
        for(String str : arrayRepetidos) {
            System.out.println(str);
        }

        //d)
        System.out.println("\nDigite uma string para contar as ocorrencias: ");
        String strPedido = ler.nextLine();
        int ocorrencias = contarOcorrencias(strPedido, arrayStrings);
        System.out.println("A string '" + strPedido + "' ocorre " + ocorrencias + " vezes");
    }
    
}
