import java.awt.Toolkit;

public class WorkerThread extends Thread { // Runnable 객체를 생성하지 않고 Thread를 상속받아 생성하기

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread thread = new WorkerThread();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
