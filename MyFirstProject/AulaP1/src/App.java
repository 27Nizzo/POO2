public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Contador ci = new Contador();
        Contador cj = new Contador();
        System.out.println("O meu contador está em " + ci.getContador()); /*isto nao vai incrementar nada 
                                                                            pois nao esta no ciclo for */
        for(int i = 0; i < 10; i++) {
            ci.incremento();
            if(i % 2 == 0) {
                cj.incremento();
            }
        }
        System.out.println("O meu contador I está em " + ci.getContador());
        System.out.println("O meu contador J está em " + cj.getContador());

    }

    public static class Contador {
        private int i;

        public Contador(){
            this.i = 0;
        }        
        
        public Contador(int i) {
            this.i = i;
        }

    public void incremento() {
        this.i += 1;
    }

    public int getContador() {
        return this.i;
    }

    }
}
