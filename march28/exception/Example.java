package march28.exception;

public class Example {

    public static void main(String[] args) {

        try {
            th();
        } catch (Exception e) {
            System.out.println("exception");
        } catch (Throwable t) {
            System.out.println("throwable");
        }


        System.err.println("before");
        method();
        System.err.println("after");

    }

    public static void method() {
        System.err.println("before");
        System.err.println(1 / 0);
        System.err.println("after");
    }

    public static void th() throws Exception {
        if(true){
            throw new Exception("bad mood");
        }
    }

}
