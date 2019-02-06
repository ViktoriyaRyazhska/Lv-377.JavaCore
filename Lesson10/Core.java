package MyPractices.Lesson10;

public class Core extends Thread {

    private int pause;
    private int times;
    private String msg;

    public Core(int pause, int times, String msg) {
        this.pause = pause;
        this.times = times;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
