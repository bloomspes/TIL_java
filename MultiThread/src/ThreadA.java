public class ThreadA extends Thread {

    public ThreadA() {
        setName("ThreadAAA");
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            System.out.println(getName());
        }
    }
}
