public class NotifyWaitExample { // wait, notify, notifyAll 연습. 파이썬의 멀티스레드와 비교해서 글을 써보자.
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        ThreadC threadC = new ThreadC(sharedObject);
        ThreadD threadD = new ThreadD(sharedObject);

        threadC.start();
        threadD.start();

    }

} 
