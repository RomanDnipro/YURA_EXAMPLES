package april14;

public class MyThread extends Thread {

    Main main;

    public MyThread(Main main) {
        this.main = main;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            main.increment();
        }
        System.out.println("done");

//        System.out.println("i am " + Thread.currentThread().getName());
//        print();
    }
    void print(){
        System.out.println("dfffffffffffff");
    }
}
