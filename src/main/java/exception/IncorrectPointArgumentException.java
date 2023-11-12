package exception;

public class IncorrectPointArgumentException extends Exception {
    public IncorrectPointArgumentException(int x, int y) {
        super("x и y должны быть положительными, а они были: " + x + ", " + y);
    }
}
