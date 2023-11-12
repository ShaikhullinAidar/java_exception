package exception;

public class PointFactory {
    public static Point create(int x, int y) throws IncorrectPointArgumentException {
        if (x >= 0 && y >= 0) {
            return new Point(x, y);
        } else {
            throw new IncorrectPointArgumentException(x, y);
        }
    }
}
