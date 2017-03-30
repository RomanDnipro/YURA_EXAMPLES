package march27.capsul.second;

import march27.capsul.first.Access;

public class AccessChild extends Access {

    static {
        System.out.println(Access.PUBLIC);
        System.out.println(Access.PROTECTED); // виден из-за наследсвта
//        System.out.println(Access.DEFAULT); не виден
//        System.out.println(Access.PRIVATE); // не виден

    }
}
