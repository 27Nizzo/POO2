//package exerc;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;


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
                break;

                case "b": 
                int a = ler.nextInt();
                int b = ler.nextInt();
                int[] newArray = teste.entreIndices(array, a, b);
                System.out.println(Arrays.toString(newArray));
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
                break;
        
            }
           break;
            case 2: 
            System.out.println("Alinea: ");
            String alinea2 = ler.next();
            int d, m, a;
            System.out.println("Tamanho do array das datas: ");
            int tamanho = ler.nextInt();
            ex2 datas = new ex2(tamanho);
           

                switch (alinea2) {
                    case "a":
                    System.out.println("Digite o dia: ");
                    d = ler.nextInt();
                    System.out.println("Digite o mes: ");
                    m = ler.nextInt();
                    System.out.println("Digite o ano: ");
                    a = ler.nextInt();
                    datas.insereData(LocalDate.of(a,m,d));
                        break;

                    case "b": 
                    System.out.println("Digite o dia: ");
                    d = ler.nextInt();
                    System.out.println("Digite o mes: ");
                    m = ler.nextInt();
                    System.out.println("Digite o ano: ");
                    a = ler.nextInt();
                    LocalDate data = LocalDate.of(a,m,d);
                    System.out.println("A data mais proxima é " + datas.dataMaisProxima(data));            
                        break;

                    case "c": 
                    System.out.println(datas.toString());
                    break;

                    default:
                    System.out.println("A alinea inserida nao existe!");
                    break;
                }
            break;

            case 3:
                
            System.out.println("Alinea: ");
            String alinea3 = ler.next();
            System.out.println("Numero de elementos for case 3: ");
            int numeroDeInteirosCase3 = ler.nextInt();
                
                int[] arrayCase3 = new int[numeroDeInteirosCase3];
            System.out.println("Elementos do array: ");
            for(int i = 0; i < numeroDeInteirosCase3; i++) {
            arrayCase3[i] = ler.nextInt();
                }

                switch (alinea3) {
                    case "a":
                        
                        break;
                    case "b": 

                        break;
                default:
                System.out.println("Nao existe a alinea inserida para este exercicio");
                    break;
                }
    
                }
        
        }

    }


