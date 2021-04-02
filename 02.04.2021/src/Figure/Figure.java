package Figure;

import java.awt.*;

public abstract class Figure {

    protected int row;
    protected int col;
    protected Color color ;
    protected  int AP;
    protected  int DP;
    protected  int MP ;
    protected  int S;




    public Figure(int row , int col){
        this.col = col;
        this.row = row;

    }

    public abstract void paint(Graphics g);

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Color getColor() {
        return color;
    }

    public int getAP() {
        return AP;
    }

    public int getDP() {
        return DP;
    }

    public int getMP() {
        return MP;
    }

    public int getS() {
        return S;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setS(int s) {
        S = s;
    }
}
