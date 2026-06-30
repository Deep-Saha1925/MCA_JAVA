public class ThreadSyncDemo {
    static int x = 5;   // shared variable
    public static void main(String[] args) throws InterruptedException {
        // Thread AOne: increments x
        Thread AOne = new Thread(() -> {
                x++;
                System.out.println("AOne: x = " + x);
        }, "AOne");
        // Thread ATwo: decrements x
        Thread ATwo = new Thread(() -> {
                x--;
                System.out.println("ATwo: x = " + x);
        }, "ATwo");
        AOne.start();
        AOne.join();    // prevent orphan thread — wait for AOne
        ATwo.start();
        ATwo.join();    // wait for ATwo
        System.out.println("Final x = " + x);
    }
}