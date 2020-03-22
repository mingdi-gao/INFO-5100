package question3;

public class ReverseHello extends Thread {
    final int MAXIMUM = 50;
    private int count;
    public ReverseHello(int count) {
        super(count + "");
        this.count = count;
    }

    @Override
    public void run() {
        if (count < MAXIMUM) {
            try {
                createNewThread();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    private void createNewThread() throws InterruptedException{
        ReverseHello th = new ReverseHello(++count);
        th.start();
        th.join();
        System.out.println("Hello from Thread " + getName());
    }
    public static void main(String[] args) {
        ReverseHello firstTh = new ReverseHello(1);
        firstTh.start();

    }
}
