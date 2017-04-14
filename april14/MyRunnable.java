package april14;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am new runnable");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
