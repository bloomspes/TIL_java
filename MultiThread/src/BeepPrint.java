public class BeepPrint {

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


    }

} 
