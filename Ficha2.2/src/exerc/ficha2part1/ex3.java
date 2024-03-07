public class ex3 {

    // a) método que ordene um array de inteiros por ordem crescente

    //Insertion Sort
    
    public int ordenaPorOrdemCrescenteArray(int[] array) {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return n;
        
    }

    //b)  método que implemente a procura binária de um elemento num array de inteiros;
    public int buscaBinaria(int[] array, int elemProcurado) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left)/2;

            if(array[middle] == elemProcurado) {
                return middle;
            } else if(array[middle] < elemProcurado){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            
        }
        return -1;
    }
}
