package MyPractices.Lesson10;

public class DeadlockDemo {
    public final static Object first = new Object();
    public final static Object second = new Object();
    public static void main(String s[]) {
        Thread t1 = new Thread() {

            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        Thread t2 = new Thread() {

            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (first) {
                        System.out.println("Success!");
                    }
                }
            }

        };
        t1.start();
        t2.start();
    }
}