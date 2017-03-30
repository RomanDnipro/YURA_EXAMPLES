package march30;

public class Outer {

    // inner
    class Inner {

    }

    // nested
    static class Nested {

    }

    // local
    {
        System.out.println();
        class Local implements MyInterface {

            @Override
            public void myMethod() {

            }
        }

        new Local();
        new Local();
        new Local();
        new Local();

    }

    // anonymous
    {

        new MyInterface() {

            @Override
            public void myMethod() {
                System.out.println("yo");
            }

        }.myMethod();

    }

}
