package march30.example;

public class Child extends Father {

    private String p = "private";

    // подобие множественного наследования
   class Inner extends Mother {

       void inner() {

           // ссылки на обрамляющий класс
//           Child.this.p = "this outer";
//           Child.super.father();

           mother();
           father();
           System.out.println(p);
       }

   }

}
