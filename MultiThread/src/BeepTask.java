import java.awt.*;

public class BeepTask implements Runnable {

    /* @Override
    public void run() {
        Runnable task = new Task();
        Thread thread = new Thread(task);
    } */

  /*
    Thread thread = new Thread(new Runnable() { // Runnable 익명 객체를 파라미터로 구현한 코드. 위와 같음.
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i=0; i<5; i++) {
                toolkit.beep();
                try { Thread.sleep(500); } catch (Exception e) { }
                // 비프음 발생시키는 스레드 정의
            }

        }

        public void start() {

        }
    });

    */

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) { }
        }
    }
}
