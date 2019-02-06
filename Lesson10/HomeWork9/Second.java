package MyPractices.Lesson10.HomeWork9;

public class Second {

    public final static Object A = new Object();
    public final static Object B = new Object();
    public final static Object C = new Object();
    public final static Object D = new Object();

    public static void main(String[] args) {
        Thread core_1 = new Thread(){
            @Override
            public void run() {
                synchronized (Second.A) {
                   Thread.yield();
                    synchronized (Second.B) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (Second.C) {
                            Thread.yield();
                            synchronized (Second.D) {
                                Thread.yield();
                            }
                        }
                    }
                }
            }
        };
        Thread core_2 = new Thread(){
            @Override
            public void run() {
                synchronized (Second.B) {
                    Thread.yield();
                    synchronized (Second.C) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (Second.D) {
                            Thread.yield();
                            synchronized (Second.A) {
                                Thread.yield();
                            }
                        }
                    }
                }
            }
        };
        Thread core_3 = new Thread(){
            @Override
            public void run() {
                synchronized (Second.C) {
                    Thread.yield();
                    synchronized (Second.D) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (Second.A) {
                            Thread.yield();
                            synchronized (Second.B) {
                                Thread.yield();
                            }
                        }
                    }
                }
            }
        };
        Thread core_4 = new Thread(){
            @Override
            public void run() {
                synchronized (Second.D) {
                    Thread.yield();
                    synchronized (Second.A) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (Second.B) {
                            Thread.yield();
                            synchronized (Second.C) {
                                Thread.yield();
                            }
                        }
                    }
                }
            }
        };

        core_1.start();
        core_2.start();
        core_3.start();
        core_4.start();
        Thread.yield();

        try {
            core_1.join();
            core_2.join();
            core_3.join();
            core_4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}