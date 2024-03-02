import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoEcra {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen Width = " + d.width);
        System.out.println("Screen Height = " + d.height);
    }


}