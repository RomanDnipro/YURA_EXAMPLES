package march28.oop;

public class Test {

    public static void main(String[] args) {

        A a = new A();
        a.method();

        A a2 = new C();
        a2.method();

        A a3 = new B();
        a3.method();

        B b = (B) a3;
        b.print();



    }

}
