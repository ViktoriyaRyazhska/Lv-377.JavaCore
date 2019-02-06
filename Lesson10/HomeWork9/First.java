package MyPractices.Lesson10.HomeWork9;

public class First {
    public static void main(String[] args) {
        Thread core1 = new CoreFirst("Hello", 5);
        Thread core2 = new CoreFirst("How are you", 5);
        Thread core3 = new CoreFirst("What the story", 5){
            @Override
            public void run() {
                try {
                    core1.join();
                    core2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };

        core1.start();
        core2.start();
        core3.start();
    }
}
