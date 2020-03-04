public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadC의 methodA 작업 실행");
        notify();
        try {
            wait();
        }
        catch (InterruptedException e) {

        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadD의 methodB 작업 실행");
        notify();
        try {
            wait();
        }
        catch (InterruptedException e) {

        }

    }
} 
