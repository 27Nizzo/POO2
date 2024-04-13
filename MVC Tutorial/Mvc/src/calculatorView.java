import java.awt.event.ActionListener;
import javax.swing.*;

public class calculatorView extends JFrame {

    private JTextField fstNum = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField sndNum = new JTextField(10);

    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);


    calculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(fstNum);
        calcPanel.add(additionLabel);
        calcPanel.add(sndNum);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }    

    public int getFstNum() {
        return Integer.parseInt(fstNum.getText());
    }

    public int getSndNum() {
        return Integer.parseInt(sndNum.getText());
    }

    public int getSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenerForCalculationButton);
    }

    void displayErrorMessager(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage, errorMessage, ABORT);
    }
}
