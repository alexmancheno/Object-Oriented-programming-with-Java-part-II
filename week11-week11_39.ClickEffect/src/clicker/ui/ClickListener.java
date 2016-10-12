
package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clicker.applicationlogic.Calculator;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {
    
    private Calculator calculator;
    private JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }
    
    public void actionPerformed(ActionEvent e) {
        calculator.increase();
        label.setText(Integer.toString(calculator.giveValue()));
    }
    
}
