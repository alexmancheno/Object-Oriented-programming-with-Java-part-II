
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    ArrayList<Figure> figures;
    
    public CompoundFigure() {
        super(100, 100);
        figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }
    
    public void draw(Graphics graphics) {
        for (Figure figure: figures)
            figure.draw(graphics);
    }
    
    public void move(int dx, int dy) {
        for (Figure figure: figures) {
            figure.move(dx, dy);
        }
    }
}
