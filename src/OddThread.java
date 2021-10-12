public class OddThread implements Runnable{
    private String name;
    private Thread thread;

    public OddThread(String name) {
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

    public OddThread() {
        thread = new Thread(this);

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0){
                    System.out.println(i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
