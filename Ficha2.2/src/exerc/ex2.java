import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class ex2 {
    private LocalDate[] data;
    private int numInsert;
    private int tamanho;

    public ex2(int tamanho) {
        this.numInsert = 0;
        this.tamanho = tamanho;
        this.data = new LocalDate[tamanho];
    }

    //a) inserir uma nova data, public void insereData(LocalDate data)
    public void insereData(LocalDate data) {
        if(numInsert < tamanho){
            this.data[this.numInsert++] = data;
        }
    }

    //b) dada uma data, determinar a data do array que está mais próxima (em termos de proximidade de calendário), public LocalDate dataMaisProxima(LocalDate data)
    public LocalDate dataMaisProxima(LocalDate data) {
        long minDist = ChronoUnit.DAYS.between(this.data[0], data);
        int posicao = 0;

        for(int i = 0; i < this.numInsert; i++) {
            long time = ChronoUnit.DAYS.between(this.data[i], data);
            if(time < minDist) {
                posicao = i; 
                minDist = time;
            }
        }
        return this.data[posicao];
    }


    //c) devolver uma String com todas as datas do array, public String toString()
    public String toString() {
        String string = "";

        for(int i = 0; i < this.numInsert; i++) {
            string += this.data[i] + "\n";
        }
        return string;
    }
}
