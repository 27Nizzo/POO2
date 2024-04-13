public class calculatorController {

    private calculatorView theView;
    private calculatorModel theModel;

    public calculatorController(calculatorView theView, calculatorModel theModel) {

    this.theView = theView;
    this.theModel = theModel;

    this.theView.addCalculationL istener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            int fstnum, sndNum = 0;

            try{
                fi
            }
        }
    }
     
    
}
