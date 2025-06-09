class counter{
    int counter;
    public synchronized void increment(){
        counter++;
    }
}

class Demo{
    public static void main(String[] args) throws InterruptedException{

        counter c = new counter();

        Runnable A = () ->
        {
            for(int i=0;i<10000;i++){
                c.increment();
            }
        };

        Runnable B = () ->
        {
            for(int i=0;i<10000;i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(A);
        Thread t2 = new Thread(B);

        t1.start();
        t2.start();

        // waiting for the above two threads to execute there task
        t1.join();
        t2.join();

        System.out.println(c.counter);
    }
}