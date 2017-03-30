package march29;

/**
 * Created by root on 29.03.17.
 */
public class Example5 {

    public static void main(String[] args) {

//        try {
//            ///...
//        } catch (Exception e) {
//            try {
//                throw new Throwable("database exception", e);
//            } catch (Throwable t) {
//
//            }
//        }

        Throwable t = new Throwable("сгорел дом", new Exception("сгорела проводка"));

        t.printStackTrace();

        Throwable cause = t.getCause();
        cause.printStackTrace();

        ArithmeticException arithmeticException = new ArithmeticException();
        arithmeticException.initCause(new Throwable());

        arithmeticException.printStackTrace();

        StackTraceElement[] stackTrace = t.getStackTrace();



    }

}
