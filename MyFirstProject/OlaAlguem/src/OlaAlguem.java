public class OlaAlguem {
    public static String geraSaudacao (String nome) {
        return "Olá " + nome + "!";
    }

    public static void main (String [] args) {
        String saudacao = geraSaudacao("Afonso");
        System.out.println(saudacao);
    }
}
