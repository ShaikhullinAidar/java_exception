package exception;

public class App {
    public static void main(String[] args) throws IncorrectPointArgumentException {
        System.out.println(PointFactory.create(1, 2));

        try {
            System.out.println(PointFactory.create(-1, -1));
        } catch (IncorrectPointArgumentException e) {
            System.out.println(e);
        }
    }
}
