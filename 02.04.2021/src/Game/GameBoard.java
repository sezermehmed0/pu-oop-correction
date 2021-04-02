package Game;

import Figure.*;
import Player.Player;
import Player.TopTile;
import Player.BotTile;
import Tile.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GameBoard extends JFrame  implements MouseListener {

    public static Player p1 = new Player(1,true,0);
    public static Player p2 = new Player(2,false,0);

    public static int randNumX;
    public static int randNumY;
    public static Random rand = new Random();
    public Object[][] tileContainer;
    public Object[][] figureContainer;
    public Object chosenFigure;
    public static int oldRowCoordinate;
    public static int oldColCoordinate;

    public GameBoard() {

        this.setSize(1000, 650);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addMouseListener(this);
        this.tileContainer = new Object[12][12];
        this.figureContainer = new Object[12][12];
        fillTopTile();
        fillBotTile();
        renderPlayer1DrunkenKnight();
        renderPlayer1SofisticatedSam();
        renderPlayer1SandTurtle();
        renderPlayer1MagicCat();
        renderPlayer1RecklesCanibal();
        renderPlayer1DogEatingBug();
        renderPlayer2MagicCat();
        renderPlayer2RecklesCanibal();
        renderPlayer2DrunkenKnight();
        renderPlayer2DogEatingBug();
        renderplayer2SandTurtle();
        renderPlayer2SofisticatedSam();





    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int rowY = this.getDimensionCoordinates(e.getY());
        int colX = this.getDimensionCoordinates(e.getX());


        if (this.isThereRenderedFigure(rowY, colX) && this.chosenFigure == null) {
            Figure figure = (Figure) figureContainer[rowY][colX];
            if (p2.isActive) {
                if (figure.getColor() == Color.red) {
                    this.chosenFigure = this.getFigure(rowY, colX);
                    oldRowCoordinate = rowY;
                    oldColCoordinate = colX;
                    p1.isActive = false;
                    p2.isActive = true;

                } else {
                    chosenFigure = null;
                }
            } else if (p1.isActive) {
                if (figure.getColor() == Color.green) {
                    this.chosenFigure = this.getFigure(rowY, colX);
                    oldRowCoordinate = rowY;
                    oldColCoordinate = colX;

                    p1.isActive = false;
                    p2.isActive = true;
                } else {

                    chosenFigure = null;
                }
            }
        }

    }




    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}



    @Override
    public void paint(Graphics g) {

        for(int row = 0; row < 12; row++) {
            for(int col = 0; col < 12; col++) {

                this.renderTiles(g,row,col);
                this.renderFigures(g, row, col);

            }
        }
    }



    public Object getFigure(int row, int col) {
        return this.figureContainer[row][col];
    }



    public boolean isThereRenderedFigure(int row, int col) {
        return this.getFigure(row, col) != null;
    }


    public Object getTile(int row, int col) {
        return this.tileContainer[row][col];
    }

    public boolean isThereTile(int row, int col) {
        return this.tileContainer[row][col] != null;
    }

    public void fillTopTile() {

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 12; col++) {
                this.tileContainer[row][col] = (new TopTile(row,col));
            }
        }
    }



    public void fillBotTile() {
        for (int row = 5; row <= 6; row++) {
            for (int col = 0; col < 12; col++) {
                this.tileContainer[row][col] = (new BotTile(row,col));
            }
        }
    }



    public void renderPlayer1DrunkenKnight() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(8);
            randNumY = rand.nextInt(7);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new DrunkenKnight(randNumX, randNumY, Color.red));
            } else i--;
        }
    }


    public void renderPlayer1SofisticatedSam() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(2);
            randNumY = rand.nextInt(12);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new SofisticatedSam(randNumX, randNumY, Color.red));
            } else i--;
        }
    }


    public void renderPlayer1SandTurtle() {
        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(2);
            randNumY = rand.nextInt(12);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new SandTurtle(randNumX, randNumY, Color.red));
            } else i--;
        }
    }



    public void renderPlayer1MagicCat() {
        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(2);
            randNumY = rand.nextInt(12);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new MagicCat(randNumX, randNumY, Color.red));
            } else i--;
        }
    }

    public void renderPlayer1RecklesCanibal() {
        for(int i = 0; i < 2; i++) {
            randNumX = rand.nextInt(2);
            randNumY = rand.nextInt(12);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new RecklessCanibal(randNumX, randNumY, Color.red));
            } else i--;
        }
    }
    public void renderPlayer1DogEatingBug() {
        for(int i = 0; i < 2; i++) {
            randNumX = rand.nextInt(2);
            randNumY = rand.nextInt(12);
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new DogEatingBug(randNumX, randNumY, Color.red));
            } else i--;
        }
    }




    public void renderPlayer2DrunkenKnight() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new DrunkenKnight(randNumX, randNumY, Color.green));
            } else i--;
        }
    }


    public void renderPlayer2SofisticatedSam() {
        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new SofisticatedSam(randNumX, randNumY, Color.green));
            } else i--;
        }
    }

    public void renderplayer2SandTurtle() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new SandTurtle(randNumX, randNumY, Color.green));
            } else i--;
        }
    }
    public void renderPlayer2MagicCat() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new MagicCat(randNumX, randNumY, Color.green));
            } else i--;
        }
    }
    public void renderPlayer2RecklesCanibal() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new RecklessCanibal(randNumX, randNumY, Color.green));
            } else i--;
        }
    }
    public void renderPlayer2DogEatingBug() {

        for(int i = 0; i < 1; i++) {
            randNumX = rand.nextInt(12);
            randNumY = rand.nextInt(12);
            while (randNumX != 5 && randNumX != 6 ) {
                randNumX = rand.nextInt(12);
                randNumY = rand.nextInt(12);
            }
            if(!this.isThereRenderedFigure(randNumX, randNumY)) {
                this.figureContainer[randNumX][randNumY] =
                        (new DogEatingBug(randNumX, randNumY, Color.green));
            } else i--;
        }
    }

    private int getDimensionCoordinates(int coordinates) {
        return coordinates / Tile.TILE_SIZE;
    }



    private void renderTiles(Graphics g, int row, int col) {
        if (this.isThereTile(row, col)) {
            Tile t = (Tile)this.getTile(row, col);
            t.renderTile(g);
        }
    }


    private void renderFigures(Graphics g, int row, int col) {

        if(this.isThereRenderedFigure(row,col)) {
            Figure figure = (Figure)this.getFigure(row,col);
            figure.paint(g);
        }
    }

}


