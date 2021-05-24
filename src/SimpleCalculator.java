import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {
    public static void main(String[] args) {
        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);
        JLabel label1 = new JLabel("number 1");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("number 2");
        JTextField textField2 = new JTextField(10);
        JButton button1 = new JButton("Add");
        windowContent.add(label1);
        windowContent.add(textField1);
        windowContent.add(label2);
        windowContent.add(textField2);
        windowContent.add(button1);
        JFrame myFrame = new JFrame("Мой первый калькулятор");
        myFrame.setContentPane(windowContent);
        myFrame.setSize(400, 100);
        myFrame.setVisible(true);
    }
}
