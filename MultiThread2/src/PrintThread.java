public class PrintThread extends Thread {

    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("test");
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException e) {

        }

    }
}
