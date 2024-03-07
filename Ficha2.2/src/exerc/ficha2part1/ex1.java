//package exerc;


public class ex1 {
    
    // a) ler inteiros para um array e enviar esse array para classe e nessa classe implementar um método que determine o valor mínimo desse array.

    public int minimo(int [] array) {
        int min = Integer.MAX_VALUE; // da-mos o valor à variavel 'min' ao maior elem do array e dps comparamos com os outros elementos, chegando assim ao verdadeiro minimo

        for(int elem: array) { // itera através de elementos de uma lista/coleção sem precisar de utilizar indices da lista
                                // o loop vai iterar sobre cada elemento de um array atribuindo o valor do elemento à variavel 'elem', e executa o codigo logo de seguida
            if (elem < min ) {
                min = elem;
            } else {
                continue;
            }
        }
        return min; 
    }

    // b) dados dois índices determinar o array com os valores entre esses índices.

    public int[] entreIndices(int[] array, int a, int b) {
        if(a < b || a < 0 || b > array.length){
            return null; 
        } 
        int [] result = new int[b - a + 1]; // (b - a + 1) é o numero de elementos a serem copiados para o array 'result'
        System.arraycopy(array, a, result, 0, b - a + 1); // metodo arryacopy copia parte do array original 'array' para o novo array 'result'
        return result;
    }

    // c) dados dois arrays de inteiros, lidos via teclado no método main da classe de teste, determinar o array com os elementos comuns aos dois arrays.
    public int[] comuns(int[] a, int[] b){
        int[] result = new int[a.length];
        int conta = 0;

        for(int elem: a){ // para elem no array a executa o bloco de codigo a baixo
             boolean enc = this.existe(result, conta, elem);
             for(int i = 0; i < b.length && !enc; i++) {
                if(enc = (elem == b[i])) {
                    result[conta++] = elem;
                }
             }
        }
        int[] resultFinal = new int[conta];
        System.arraycopy(result, 0, resultFinal, 0, conta);

        return resultFinal;
    }


    private boolean existe(int[] array, int n, int elem) {
        boolean result = false;

        for (int i = 0; i < n; i++){
            if(array[i] == elem) {
                return true;
            }
       }
        return result;
    }
}
