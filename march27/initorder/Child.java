package march27.initorder;

public class Child extends Parent {

    static int a = getA();
    int b = getB();

    public int getB() {
        System.out.println("child non-static method");
        return 0;
    }

    public Child(int y) {
        super(y);
        System.out.println("child constuctor");
        this.y = y;
    }

    static {
        System.out.println("child static block");
        x = 1;
    }

    public static int getA() {
        System.out.println("child static method");
        return -1;
    }

    {
        System.out.println("child non-static block");
        y = 2;
    }

}
