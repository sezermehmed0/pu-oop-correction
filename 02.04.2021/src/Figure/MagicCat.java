package Figure;

import Tile.Tile;

import java.awt.*;

public class MagicCat extends Figure {
    public MagicCat(int row, int col,Color color) {
        super(row, col);
        this.color = color;
        this.AP = 8;
        this.DP = 5;
        this.MP = 10;
        this.S = 1;
    }

    @Override
    public void paint(Graphics g) {
        int x = this.col * Tile.TILE_SIZE;
        int y = this.row * Tile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 20,60,60);
        g.setColor(Color.BLACK);
        g.drawString(" MC ", x + 30, y + 50);

    }
}
