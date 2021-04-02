package Figure;

import Tile.Tile;

import java.awt.*;

public class SandTurtle extends Figure {
    public SandTurtle(int row, int col,Color color) {
        super(row, col);
        this.color = color;
        this.AP = 5;
        this.DP = 10;
        this.MP = 1;
        this.S = 4;
    }


    @Override
    public void paint(Graphics g) {
        int x = this.col * Tile.TILE_SIZE;
        int y = this.row * Tile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 20,60,60);
        g.setColor(Color.BLACK);
        g.drawString(" ST ", x + 30, y + 50);


    }
}
