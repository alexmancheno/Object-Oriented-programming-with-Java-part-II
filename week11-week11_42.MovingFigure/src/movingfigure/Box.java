
package movingfigure;

import java.awt.Graphics;

public class Box extends Figure {
    private int width;
    private int length;
    
    public Box (int x, int y, int width, int length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }
    
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), width, length);
    }
}
