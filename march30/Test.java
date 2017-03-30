package march30;

public class Test {

    public static void main(String[] args) {

        // instance of inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // instance of nested class
        Outer.Nested nested = new Outer.Nested();

        // instance of local class
        class Local {}
        Local local = new Local();

        // instance of anonymous class
        new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("anonymous");
            }
        }; // semicolon is required

    }

}
