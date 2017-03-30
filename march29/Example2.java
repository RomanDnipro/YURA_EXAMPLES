package march29;

import java.util.Random;

public class Example2 {

    private static Random random = new Random();

    public static void main(String[] args) {

        try {
            throwable();
        } catch (ArithmeticException e) {
            System.out.println("arithmetic");
        } catch (Exception e) {
            System.out.println("exception");
        } catch (Error e) {
            System.out.println("error");
        } catch (Throwable t) {
            System.out.println("throwable");
        }

    }

    public static void throwable() {
        if (random.nextBoolean()) {
            throw new RuntimeException();
        } else {
            throw new IllegalAccessError();
        }

    }

}
