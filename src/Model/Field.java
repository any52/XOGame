package Model;

/**
 * Created by Anna on 26.08.2016.
 */
public class Field {

    public static final int MAX_LENGTH = 10;
    public static final int MAX_WIDTH = 10;

    public enum Type {X, NONE}

    Type[][] cells;

    public Field() {
        init();
    }

    public void init() {
        cells = new Type[MAX_LENGTH][MAX_WIDTH];
        for (int i = 0; i < MAX_LENGTH; i++) {
            for (int j = 0; j < MAX_WIDTH; j++) {
                cells[i][j] = Type.NONE;
            }
        }
    }

    public void show() {
        for (int i = 0; i < MAX_LENGTH; i++) {
            for (int j = 0; j < MAX_WIDTH; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.println("X");
                        break;
                    case NONE:
                        System.out.println(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void doShoot(Point point, Type type) {
        cells[point.getX()][point.getY()] = type;

    }
}