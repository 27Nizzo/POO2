public class DeclaraçõesInicializaçãoeDimen {
    int  lista1 []; // estilo C 
    int[] lista2; // estilo java


    int[] turma = new int[100]; //Array turma que tem capacidade de 100 elementos
    double[] medias = new double[50]; // Array media tem capacidade de 50 elementos
    byte[] memoriaVideo = new byte[1920*1080]; // -> este array aloca memoria para um array de bytes baseado no produto de 1920 e 1080


    short matriz1[][] = new short [10][50]; // declaração de uma matriz 2D que tem 10 linhas e 50 colunas
    short matriz2[][] = new short [10][0]; // declaração de uma matriz 2D mas que tem apenas 10 linhas e 1 coluna


    matriz1[0] = new short [15]; 
    matriz2[1] = new short[40];


    String[] nomes = new String[20];
    String[] jogadores = {"Deco", "Hulk", "Falcão"};
// Comprimento de um array
    int numeroCraques = jogadores.length;

    String[] [] texto = {
        {"O", "trabalho" , "de", "POO",},
        {"foi", "disponibilizado", "hoje"}, 
        {"Os", "professores"}
    };

        String[][] galo = {
            {"O", "O", "X"},
            {"X", "X", "O"},
            {"O", "X", "O"},
        };

        Aluno[] alunos = new Aluno [165];
        int numeroAlunos = alunos.length;

        Object obj[] = new Object[25];

    }
