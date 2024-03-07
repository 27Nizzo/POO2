package ficha2part2;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    private int[][] notasDaTurma;

    public ex5(int numAlunos, int numUCs) {
        notasDaTurma = new int[numAlunos][numUCs];
    }

    // a) Método para ler as notas dos alunos: 
    public void lerNotas() {
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.println("Digite a nota do aluno " + (i + 1) + " na unidade " + (j + 1) + ": ");
                notasDaTurma[i][j] = ler.nextInt();
            }
        }
    }

    // b) Método para clacular a soma das notas de uma UC: 
    public int calcular_soma_das_notasUC(int indiceUC) {
        int soma = 0; 

        for(int i = 0; i < notasDaTurma.length;i++) {
            soma += notasDaTurma[i][indiceUC];
        }
        return soma; 
    }

    // c) Método para calcular a média das notas de um aluno: 
    public double calcularMedia(int indiceAluno) {
        int soma = Arrays.stream(notasDaTurma[indiceAluno]).sum();
        return (double) soma/notasDaTurma[indiceAluno].length;
    }

    // d) Método para calcular a média das notas de uma unidade curricular: 
    public double calcularMediaUC(int indiceUC) {
        int soma = calcular_soma_das_notasUC(indiceUC);
        return (double) soma / notasDaTurma.length;
    }

    // e) Método para clacular a nota mais alta em todas as unidades curriculares: 
    public int calcularNotaMaisAlta() {
        int notaMaisAlta = notasDaTurma[0][0];

        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                notaMaisAlta = Math.max(notaMaisAlta, notasDaTurma[i][j]);
            }
        }

        return notaMaisAlta; 
    }

    // f) Método para calcular a nota mais baixa em todas unidades curriculares: 
    public int calcularNotaMaisBaixa() {
        int notaMaisBaixa = notasDaTurma[0][0];
        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                notaMaisBaixa = Math.min(notaMaisBaixa, notasDaTurma[i][j]);
            }
        }
        return notaMaisBaixa;
    }

    // g) Método para devolver o array com as notas acima de um determinado valor:
    public int[][] obterNotasAcimaDeValor(int valorLimite) {
        int[][] notasAcima = new int[notasDaTurma.length][notasDaTurma[0].length];

        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                if(notasDaTurma[i][j] > valorLimite) {
                    notasAcima[i][j] = notasDaTurma[i][j];
                }
            }
        }
        return notasAcima;
    }

    // h) Método para calcular numa String com as notas de todos os alunos:
    public String obterStringNotas() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < notasDaTurma.length; i++) {
            result.append("Aluno ").append(i + 1).append(": ");
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                result.append(notasDaTurma[i][j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ex5 pauta = new ex5(5, 5);
        pauta.lerNotas();

        int indiceUC = 1; // Substitua pelo índice desejado
        int somaNotasUC = pauta.calcular_soma_das_notasUC(indiceUC);
        System.out.println("Soma das notas da UC " + indiceUC + ": " + somaNotasUC);

        int indiceAluno = 2; // Substitua pelo índice desejado
        double mediaNotasAluno = pauta.calcularMedia(indiceAluno);
        System.out.println("Média das notas do aluno " + indiceAluno + ": " + mediaNotasAluno);

        int indiceUC2 = 2; // Substitua pelo índice desejado
        double mediaNotasUC2 = pauta.calcularMediaUC(indiceUC2);
        System.out.println("Média das notas da UC " + indiceUC2 + ": " + mediaNotasUC2);

        int notaMaisAlta = pauta.calcularNotaMaisAlta();
        System.out.println("Nota mais alta em todas as UCs: " + notaMaisAlta);

        int notaMaisBaixa = pauta.calcularNotaMaisBaixa();
        System.out.println("Nota mais baixa em todas as UCs: " + notaMaisBaixa);

        int valorLimite = 15; // Substitua pelo valor desejado
        int[][] notasAcimaDeValor = pauta.obterNotasAcimaDeValor(valorLimite);
        System.out.println("Notas acima de " + valorLimite + ": ");
        for (int[] linha : notasAcimaDeValor) {
            for (int nota : linha) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        String stringNotas = pauta.obterStringNotas();
        System.out.println("Notas de todos os alunos: ");
        System.out.println(stringNotas);
    }
    
}
