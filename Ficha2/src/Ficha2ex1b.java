import java.util.Scanner;

public class Ficha2ex1b {

    public static void main(String[] args) {
        Ficha2ex1b prog = new Ficha2ex1b();
        prog.exe();
    }

    public void exe(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Primeiro indice:");
        int n1 = ler.nextInt();
        System.out.println("Segundo indice:");
        int n2 = ler.nextInt();

        int[] array = new int[] {1, 2, 3}; // Replace {1, 2, 3} with your desired array initialization

        int[] result = entreV(array, n1, n2);

        ler.close();
    }

    public int [] entreV(int [] array, int a, int b) {
        if (a > b || a < 0 || b > array.length) {
            return null;
        }

        int [] result = new int[b-a+1];
        System.arraycopy(array, a, result, 0, b - a + 1);
        
        return result;
    }

    
    
}
