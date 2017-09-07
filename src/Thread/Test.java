package Thread;

import sun.awt.windows.ThemeReader;

/**
 * Created by lsj on 17/8/30.
 */
public class Test {
    private static int number;
    private static boolean ready;
    private static volatile int v;
    private int norm3;
    private int t3;

    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            int x = number;
            try {
                Thread.sleep(2000);
                System.out.println("V2:  " + v);
                v = 2;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += 1;
            number = x;
        }
    }

    private static class ReaderThread2 extends Thread{
        @Override
        public void run() {
            int x = number;
            try {
                Thread.sleep(1000);
                System.out.println("V2:  " + v);
                v = 2;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += 1;
            number = x;
        }
    }

    public static void main(String[] args) {
        number = 0;
        new ReaderThread().start();
        new ReaderThread().start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
    }


    // aaaaaaaaa
    // bbbbbb
}
