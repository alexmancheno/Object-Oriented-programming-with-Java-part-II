package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.BorderLayout;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        JLabel text = new JLabel(Integer.toString(calculator.giveValue()));
        JButton countButton = new JButton("Click!");
        ClickListener click = new ClickListener(calculator, text);
        countButton.addActionListener(click);
        
        container.add(text, BorderLayout.CENTER);
        container.add(countButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
