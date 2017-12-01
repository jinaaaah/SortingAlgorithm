import processing.core.PApplet;

public class Bar {
    private PApplet pApplet;
    private int x, y;
    private int barSize;
    private int sPoint;

    public Bar(PApplet p, int x, int y, int BarSize, int sPoint){
        this.x = x;
        this.y = y;
        this.barSize = BarSize;
        this.sPoint = sPoint;
        this.pApplet = p;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void draw(){
        pApplet.stroke(0);
        pApplet.fill(255);
        pApplet.rect(x,y + sPoint,barSize,300 - y);
    }
}
