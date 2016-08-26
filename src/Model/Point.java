package Model;

import java.util.Random;

/**
 * Created by Anna on 26.08.2016.
 */
public class Point {
    private int y;
    private int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public Point() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public  static Point getRandomPoint() {
        return new Point(new Random().nextInt(10), new Random().nextInt(10));
    }
}
