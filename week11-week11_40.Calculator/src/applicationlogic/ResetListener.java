package applicationlogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ResetListener implements ActionListener {
    
    private JTextField top;
    private JTextField mid;
    private JButton resetButton;
    
    public ResetListener(JTextField top, JTextField mid, JButton resetButton) {
        this.top = top;
        this.mid = mid;
        this.resetButton = resetButton;        
        this.resetButton.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent e) {        
        top.setText("0");
        mid.setText(null);
        resetButton.setEnabled(false);        
    }
}
