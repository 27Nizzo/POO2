import java.math.BigInteger;
/* A classe BigInteger é da biblioteca ".math" usada para 
 * representar numeros inteiros muito grandes como 5000!, ela
 * consegue lidar com números inteiros de tamanho praticamente 
 * ilimitado, enquanto o int e o long têm limites fixos
*/
import java.util.Date;


public class ex7 {

public BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }



    public long tempoGasto() {

        Date beforeDate = new Date();
        long beforeMillis = System.currentTimeMillis();

        BigInteger resultado = factorial(5000);

        Date afterDate = new Date();
        long afterMillis = System.currentTimeMillis();

        long tempoGastoMillis = afterMillis - beforeMillis;

        System.out.println("5000! = " + resultado);
        System.out.println("Data e hora antes do calculo: " + beforeDate);
        System.out.println("Data e hora após do calculo: " + afterDate);
        System.out.println("Tempo gasto (milisegundos): " + tempoGastoMillis);

        return tempoGastoMillis;

    }

    public static void main(String[] args) {
        ex7 exe = new ex7();
        long tempoGastoMillis = exe.tempoGasto();
        System.out.println("Tempo total gasto (milisegundos): " + tempoGastoMillis);
    }

}