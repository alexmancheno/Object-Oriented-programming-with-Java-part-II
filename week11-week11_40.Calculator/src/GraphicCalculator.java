
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.WindowConstants;
import applicationlogic.AddListener;
import applicationlogic.SubtractListener;
import applicationlogic.ResetListener;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        frame.setLayout(layout);

        JTextField topField = new JTextField("0");
        topField.setEnabled(false);
        JTextField middleField = new JTextField("0");

        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        
        AddListener add = new AddListener(topField, middleField, z);
        SubtractListener subtract = new SubtractListener(topField, middleField, z);
        ResetListener reset = new ResetListener(topField, middleField, z);
        
        minus.addActionListener(subtract);
        plus.addActionListener(add);
        z.addActionListener(reset);

        bottomPanel.add(plus);
        bottomPanel.add(minus);
        bottomPanel.add(z);

        frame.add(topField);
        frame.add(middleField);
        frame.add(bottomPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
