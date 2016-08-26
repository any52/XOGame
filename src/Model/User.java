package Model;

/**
 * Created by Anna on 26.08.2016.
 */
public class User implements Shootable{
    public static Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    @Override
    public Point getShoot() {
        return null;
    }
}
