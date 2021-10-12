public class EvenThread implements Runnable{
    private String name;
    private Thread thread;

    public EvenThread(String name) {
        this.name = name;
        thread = new Thread(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
