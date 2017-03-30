package march27.capsul.first;

public class Access {

    public static final int PUBLIC = 1;
    protected static final int PROTECTED = 2;
    static final int DEFAULT = 3;
    private static final int PRIVATE = 4;

    static {
        System.out.println(PUBLIC);
        System.out.println(PROTECTED);
        System.out.println(DEFAULT);
        System.out.println(PRIVATE);
    }

}
