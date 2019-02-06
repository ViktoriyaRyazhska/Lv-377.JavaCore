package MyPractices.Lesson10.HomeWork9;

public class CoreFirst extends Thread {

    private String msg;
    private int times;

    public CoreFirst(String msg, int times) {
        this.msg = msg;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
