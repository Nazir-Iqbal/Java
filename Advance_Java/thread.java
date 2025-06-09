class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                // making the thread to wait for this amount of time after each execution
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Demo{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        // we can set the prioirty of the thread (1-10)
        obj1.setPriority(Thread.MAX_PRIORITY);  
        obj1.start();
        obj2.start();
    }
}