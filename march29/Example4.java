package march29;

import java.util.Random;

public class Example4 {

    private static Random random = new Random();

    public static void main(String[] args) {

        int x = -1;

        try {
            x = getX();
        } catch (RuntimeException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println(x);

    }

    private static int getX() {
        try {
            throwable();
            System.out.println("ok");
            return 1;
        } finally {
            System.out.println("bye");
            throw new RuntimeException("finally exception");
//            return 2; // недостижимое выражение
        }
    }

    public static void throwable() {
        if (random.nextBoolean()) {
            System.out.println("break");
            throw new RuntimeException();
        }
    }

}
