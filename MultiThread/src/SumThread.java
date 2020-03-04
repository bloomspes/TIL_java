public class SumThread extends Thread { // join() 메소드의 동작을 살피기 위해 작성된 코드

    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i=0; i<100; i++) {
            sum += 1;
        }
    }
} 
