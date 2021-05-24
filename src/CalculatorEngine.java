import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
    Calculator parent;
    char selectedAction;
    double currentRezult;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String displayFieldText = parent.textField.getText();
        double displayValue = 0;

        if (!"".equals(displayFieldText)) {
            displayValue = Double.parseDouble(displayFieldText);
        }

        Object src = e.getSource();

        if (src == parent.buttonPlus) {

            selectedAction = '+';
            currentRezult = displayValue;
            parent.textField.setText("");

        } else if (src == parent.buttonMinus) {

            selectedAction = '-';
            currentRezult = displayValue;
            parent.textField.setText("");

        } else if (src == parent.buttonMultiplay) {

            selectedAction = '*';
            currentRezult = displayValue;
            parent.textField.setText("");

        } else if (src == parent.buttonDivide) {

            selectedAction = '/';
            currentRezult = displayValue;
            parent.textField.setText("");

        } else if (src == parent.buttonEqual) {

            if (selectedAction == '+') {
                currentRezult += displayValue;

            } else if (selectedAction == '-') {
                currentRezult -= displayValue;

            } else if (selectedAction == '*') {
                currentRezult *= displayValue;

            } else if (selectedAction == '/') {
                currentRezult /= displayValue;
            }

            parent.textField.setText("" + currentRezult);

        } else {
            String clickedButtonLabel = clickedButton.getText();
            parent.textField.setText(displayFieldText + clickedButtonLabel);
        }

    }

}
