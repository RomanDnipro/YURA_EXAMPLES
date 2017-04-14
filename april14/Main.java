package april14;


public class Main {

    public volatile int a = 0;

    public static void main(String[] args) throws InterruptedException {

//        MyRunnable myRunnable = new MyRunnable();

//        Thread thread = new Thread(myRunnable);
//        thread.start();

        Main main = new Main();

        Thread thread1 = new MyThread(main);
        thread1.start();

        Thread thread2 = new MyThread(main);
        thread2.start();

        Thread thread3 = new MyThread(main);
        thread3.start();

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i am " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(7);
//            } catch (InterruptedException e) {
//            }
//        }

        Thread.sleep(10000);
        System.out.println(main.a);

    }

    public synchronized void increment() {
        a++;
    }



}
