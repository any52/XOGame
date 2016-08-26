package Controller;
import Model.Field;
import Model.Point;
import Model.User;
/**
 * Created by Anna on 26.08.2016.
 */
public class GameController {
    public static void doShoot(Point point, Field.Type type) {
        User.point = point;
//        User.isShoot = true;
    }
}
