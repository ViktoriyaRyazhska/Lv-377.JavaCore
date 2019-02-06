package MyPractices.Lesson10.HomeWork9;

public class Third {
    public static void main(String[] args) {
        Thread One = new Thread(){
            @Override
            public void run() {
                Thread Two = new CoreFirst("Thread number two", 3) {
                    @Override
                    public void run() {
                        super.run();
                        Thread Tree = new CoreFirst("Thread number tree", 5);
                        Tree.start();
                    }
                };
                Two.start();
            }
        };

        One.start();
    }
}
