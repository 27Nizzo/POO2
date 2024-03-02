import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("A linguagem do Sistema está em: " + local.getDisplayLanguage() + " " + local.getLanguage());
    }
}
