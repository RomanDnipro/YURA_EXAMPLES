package march27.initorder;

public class Parent {

    static {
        System.out.println("parent static block");
        x = 1;
    }

    static int x = getX();

    public static int getX() {
        System.out.println("parent static method");
        return -1;
    }

    public Parent(int y) {
        System.out.println("parent constuctor");
        this.y = y;
    }

    int y = getY();

    {
        System.out.println("parent non-static block");
        y = 2;
    }



    public int getY() {
        System.out.println("parent non-static method");
        return -2;
    }

}
