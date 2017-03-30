package march27.constuct;

public class A {

    int x;

    // overloading

    public A(int xx) {
        System.out.println("with param: " + xx);
        x = xx;
    }

    public A() {
        this(9);
        System.out.println("without param");
    }
}
