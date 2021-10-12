public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("odd");
        EvenThread evenThread = new EvenThread("even");
        oddThread.getThread().start();
        evenThread.getThread().start();
    }
}
