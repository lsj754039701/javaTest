package Thread;

/**
 * Created by lsj on 17/8/30.
 */
public class Test {
    private static int number;
    private static boolean ready;
    private volatile int v;

    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            while (!ready){
                System.out.println("1");
                Thread.yield();
                System.out.println("3");
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        while(true) {
            ready = false;
            new ReaderThread().start();
            number = 42;
            ready=true;
        }
    }
    // aaaaaaaaa
    // bbbbbb
}
