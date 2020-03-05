public class mainThread { // wait, notify, notifyAll 연습. 파이썬의 멀티스레드와 비교해서 글을 써보자.
    public static void main(String[] args) {
        /*
        WorkObject sharedObject = new WorkObject();

        ThreadC threadC = new ThreadC(sharedObject);
        ThreadD threadD = new ThreadD(sharedObject);

        threadC.start();
        threadD.start();
        */
        ThreadGroup TestGroup = new ThreadGroup("TestGroup");
        InterruptTest workThreadA = new InterruptTest(TestGroup, "workThreadA");
        InterruptTest workThreadB = new InterruptTest(TestGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("main thread >> list() 출력 내용");

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
        mainThreadGroup.list();
        System.out.println();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {

        }
        // TestGroup의 interrupt() 호출
        TestGroup.interrupt();

    }

} 
