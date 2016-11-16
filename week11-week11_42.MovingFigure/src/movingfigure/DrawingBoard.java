
package movingfigure;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawingBoard extends JPanel {
    private Figure figure;
    
    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        figure.draw(g);
    }
}
