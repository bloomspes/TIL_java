public class ThreadD extends Thread {
    private WorkObject workObject;

    public ThreadD (WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0; i<20; i++) {
            workObject.methodB();
        }
    }
}
