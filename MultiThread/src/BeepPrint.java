public class BeepPrint extends Thread {

    public static void main(String[] args) {
        Runnable beepTask = new BeepTask(); // BeepTask 객체 생성
        Thread thread = new Thread(beepTask); // BeepTask 객체를 파라미터로 받아 작업 스레드 생성
        thread.start(); // 여기서 BeepTask.java의 run() 메소드가 실행된다.

        for (int i=0; i<5; i++) {
            System.out.println("삡");
            try { Thread.sleep(500); }
            catch (Exception e) { }
        }

        Thread nameThread = Thread.currentThread(); // Thread의 정적 메소드인 currentThread();로 현재 스레드의 참조를 얻을 수 있다.
        System.out.println(nameThread.getName());

        Thread threadA = new ThreadA();
        System.out.println(threadA.getName());
        threadA.start(); // ThreadA 시작

        Thread threadB = new ThreadB();
        System.out.println(threadB.getName());
        threadB.start();


        for(int i=0; i<10; i++) { // thread 우선순위에 따른 스레드 스케쥴링 학습
            thread = new CalcThread("Thread" + i);
            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }

        // 스레드 실행 양보 - yield() 예제

        threadA.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        ((ThreadA) threadA).work = false;

        /*
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        ((ThreadA) threadA).work = true;


        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        ((ThreadA) threadA).stop = true;
        ((ThreadB) threadB).stop = true;
        */

    }

} 
