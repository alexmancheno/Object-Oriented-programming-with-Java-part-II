
package applicationlogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddListener implements ActionListener {

    private JTextField top;
    private JTextField mid;
    private JButton addButton;    
    
    public AddListener(JTextField top, JTextField mid, JButton addButton) {
        this.top = top;
        this.mid = mid;
        this.addButton = addButton;
    }
    
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < mid.getText().length(); i++)
            if (!Character.isDigit(mid.getText().charAt(i))) {
                mid.setText(null);
                return;
            }
        
        int topValue = Integer.parseInt(top.getText());
        int midValue = Integer.parseInt(mid.getText());
        top.setText(String.valueOf(topValue + midValue));
        mid.setText(null);
        addButton.setEnabled(true);
    }
    
}
