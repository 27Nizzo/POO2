package ficha2part2;

import java.util.Scanner;

public class ex6 {

    //a) Método para ler uma matriz: 
    public static int[][] lerMatriz() {
        Scanner ler = new Scanner(System.in); 
        System.out.println("Digite um numero de linhas: ");
        int linhas = ler.nextInt();
        System.out.println("Digite um numero de colunas: ");
        int colunas = ler.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz: ");

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        return matriz; 
    }
    
}
