
package applicationlogic;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SubtractListener implements ActionListener {
    
    private JTextField top;
    private JTextField mid;
    private JButton subtractButton;
    
    public SubtractListener(JTextField top, JTextField mid, JButton subtractButton) {
        this.top = top;
        this.mid = mid;
        this.subtractButton = subtractButton;
    }
    
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < mid.getText().length(); i++)
            if (!Character.isDigit(mid.getText().charAt(i))) {
                mid.setText(null);
                return;
            }
        
        top.setText(String.valueOf(Integer.parseInt(top.getText()) - Integer.parseInt(mid.getText())));
        mid.setText(null);
        subtractButton.setEnabled(true);
    }
}
