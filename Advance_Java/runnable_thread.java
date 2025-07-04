class A implements Runnable
{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Demo{
    public static void main(String args[]){
        A obj1 = new A();
        // Functional Interaface (implemented using the lambda function)
        Runnable obj2 = () ->
        {
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
