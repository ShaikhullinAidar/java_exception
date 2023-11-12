package exception;

public class Second {

    public static double devByZero(int d) {
        if (d == 0) {
            return 1;
        } else {
            return d / 0;
        }
    }

    public static int[][] getTwoDimensionalArrayInt(int a, int b) {
        if (a < 6 && b < 6) {
            return new int[a][b];
        } else {
            throw new ArrayStoreException("a and b must be smaller than 6");
        }
    }

    public static String getName(int i) {
        var Names = new String[]{"Vasa", "Peta", "Ivan"};
        return Names[i];
    }

    public static void main(String[] args) {
        System.out.println(devByZero(0));
        try {
            devByZero(1);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }

        var intArray = getTwoDimensionalArrayInt(4, 4);
        try {
            var intArray1 = getTwoDimensionalArrayInt(10, 4);
        } catch (ArrayStoreException ex) {
            System.out.println(ex);
        }

        System.out.println(getName(1));
        try {
            System.out.println(getName(5));
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
    }

}
