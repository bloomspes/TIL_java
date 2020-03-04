public class ThreadB extends Thread{

    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(getName());
        }

        while(!stop) {
            if (work) {
                System.out.println("ThreadB while() 실행됨");
            }
            else {
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }

} 
