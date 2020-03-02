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
    }

} 
