package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(95, 45, 55, 55);
        graphics.fillRect(245, 45, 55, 55);
        
        graphics.fillRect(40, 190, 55, 55);
        graphics.fillRect(95, 245, 205, 55);
        graphics.fillRect(300, 190, 55, 55);
    }
}
