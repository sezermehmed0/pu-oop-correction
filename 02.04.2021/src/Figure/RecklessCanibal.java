package Figure;

import Tile.Tile;

import java.awt.*;

public class RecklessCanibal extends Figure {
    public RecklessCanibal(int row, int col,Color color) {
        super(row, col);
        this.color = color;
        this.AP = 4;
        this.DP = 6;
        this.MP = 8;
        this.S = 10;
    }

    @Override
    public void paint(Graphics g) {
        int x = this.col * Tile.TILE_SIZE;
        int y = this.row * Tile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 20,60,60);
        g.setColor(Color.BLACK);
        g.drawString(" RC ", x + 30, y + 50);

    }
}
