import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
    JFormattedTextField textField = new JFormattedTextField();
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiplay = new JButton("*");
    JButton buttonDivide = new JButton("/");
    CalculatorEngine calcEngine = new CalculatorEngine(this);

    Calculator() {
        JFrame myFrame = new JFrame("My Calculator");
        myFrame.setContentPane(prepareWindowContentPanel());
        myFrame.pack();
        myFrame.setVisible(true);
    }

    private JPanel prepareWindowContentPanel() {
        JPanel windowContentPanel = new JPanel();
        windowContentPanel.setLayout(new BorderLayout());
        windowContentPanel.add("North", prepareTextField());
        windowContentPanel.add("Center", preparePanelCenter());
        windowContentPanel.add("East", preparePanelEast());
        return windowContentPanel;
    }

    private JFormattedTextField prepareTextField() {
        textField.setHorizontalAlignment(JTextField.RIGHT);
        return textField;
    }

    private JPanel preparePanelCenter() {
        JPanel panelCenter = createPanelWithGrid(4, 3);
        return fillPanelByNymButtonsAndAddActionListener(panelCenter);
    }

    private JPanel preparePanelEast() {
        JPanel panelEast = createPanelWithGrid(4, 1);
        return fillPanelBySymButtonsAndAddActionListener(panelEast);
    }

    private JPanel createPanelWithGrid(int numberRows, int numberColumns) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(numberRows, numberColumns));
        return panel;
    }

    private JPanel fillPanelByNymButtonsAndAddActionListener(JPanel panel) {

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            panel.add(button);
            button.addActionListener(calcEngine);
        }

        panel.add(buttonPoint);
        panel.add(buttonEqual);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        return panel;
    }

    private JPanel fillPanelBySymButtonsAndAddActionListener(JPanel panel) {
        panel.add(buttonPlus);
        panel.add(buttonMinus);
        panel.add(buttonMultiplay);
        panel.add(buttonDivide);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonMultiplay.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        return panel;
    }


    public static void main(String[] args) {
        new Calculator();
    }
}
