public class ThreadA extends Thread {

    public boolean stop = false;
    public boolean work = true;

    public ThreadA() {
        setName("ThreadAAA");
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            System.out.println(getName());
        }

        while(!stop) {
            if (work) {
                System.out.println("ThreadA while() 실행됨");
            }
            else {
                Thread.yield(); // false 일때 다른 스레드에게 실행 양보
            }
        }
        System.out.println("ThreadA 종료");

    }

}
