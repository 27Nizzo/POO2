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

    // b) Método para somar duas matrizes: 
    public static int[][] somarM(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;

        int[][] resultado = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    // c) Método para verificar se duas matrizes são iguais:
    public static boolean matrizesIguais(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            return false;
        }

        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizB.length; j++) {
                if(matrizA[i][j] != matrizB[i][j]) {
                    return false;
                }
            }
        }
        return true; 
    }
    
    // d) Método para obter a matriz oposta:
    public static int[][] matrizOposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] oposta = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                oposta[i][j] = -matriz[i][j];
            }
        }
        return oposta;
    }


    public static void main(String[] args) {
        
        //a)
        System.out.println("Matriz A: ");
        int[][] matrizA = lerMatriz();
        
        System.out.println("Matriz B: ");
        int[][] matrizB = lerMatriz();
        
        //b) 
        int[][] somaMatrizes = somarM(matrizA, matrizB);

        //c)
        boolean saoIguais = matrizesIguais(matrizA, matrizB);

        //d) 
        int[][] matrizOpostaA = matrizOposta(matrizA);
        int[][] matrizOpostaB = matrizOposta(matrizB);

        System.out.println("\nSoma das Matrizes A e B: ");
        exibirMatriz(somaMatrizes);

        System.out.println("\nMatriz A e B são iguais? " + saoIguais);

        System.out.println("\nMatriz Oposta de A: " + matrizOpostaA);
        exibirMatriz(matrizOpostaA);
        System.out.println("\nMatriz Oposta de B: " + matrizOpostaB);
        exibirMatriz(matrizOpostaB);


    }

    public static void exibirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
