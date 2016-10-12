package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        ButtonGroup why = new ButtonGroup();
        JRadioButton noReason = new JRadioButton("No reason.");
        why.add(noReason);
        JRadioButton becauseFun = new JRadioButton("Because it is fun!");
        why.add(becauseFun);

        JButton done = new JButton("Done!");

        container.add(new JLabel("Are you?"));
        container.add(yes);
        container.add(no);
        container.add(new JLabel("Why?"));
        container.add(noReason);
        container.add(becauseFun);
        container.add(done);
    }

    public JFrame getFrame() {
        return frame;
    }
}
