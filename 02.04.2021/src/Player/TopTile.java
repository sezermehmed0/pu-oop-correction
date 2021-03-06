package Player;

import Tile.Tile;

import java.awt.*;

public class TopTile extends Tile {
    public TopTile(int row, int col) {
        super(row, col);

    }

    @Override
    public void renderTile(Graphics g) {

        int tileX = this.col * Tile.TILE_SIZE;
        int tileY = this.row * Tile.TILE_SIZE;

        paintTiles(g, tileX, tileY);

        if (this.row == 0 && this.col % 2 == 0 || this.row == 1 && this.col % 2 == 1) {
            g.setColor(Color.gray);
            g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);

        } else if(this.row == 0 && this.col % 2 == 1 || this.row == 1 && this.col % 2 == 0) {
            g.setColor(Color.black);
            g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);

        }
    }

    public void paintTiles(Graphics g, int tileX, int tileY) {
        if(this.row == 0 && this.col == 0) {
            g.setColor(Color.gray);
            g.fillRect(tileX,tileY,TILE_SIZE, TILE_SIZE);

        } else if (this.row == 1 && this.col == 0) {
            g.setColor(Color.black);
            g.fillRect(tileX,tileY,TILE_SIZE, TILE_SIZE);

        }
    }
}