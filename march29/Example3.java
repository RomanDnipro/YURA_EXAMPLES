package march29;

import java.util.Random;

public class Example3 {

    private static Random random = new Random();

    public static void main(String[] args) {

        int x = getX();
        System.out.println(x);

    }

    private static int getX() {
        try {
            throwable();
            System.out.println("ok");
            return 1;
        } catch (RuntimeException e) {
            System.out.println("was broken");
            throwable(); // может сломаться и в catch'e
            return 0;
        } finally {
            System.out.println("bye");
            return 2; // return в finally перекрывает другие returns
            // return в finally может подавить летящее исключение
        }
    }

    public static void throwable() {
        if (random.nextBoolean()) {
            System.out.println("break");
            throw new RuntimeException();
        }
    }
}
