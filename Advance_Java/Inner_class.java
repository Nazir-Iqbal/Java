public class Inner_class{
    public static void main(String[] args){
        // creating the object of A
        A obj1 = new A();
        // creating the object of B
        // A.B obj2 = obj1.new B();
        // for static class
        A.B obj2 = new A.B();

        // creating the anonymous inner class
        A obj3 = new A(){
            void show(){
                System.out.println("Overiding the function of class A");
            }
        };
        obj3.show();

    }
}

class A{
    int age;

    void show(){
        System.out.println("In the class A...");
    }

    static class B{
        void show(){
            System.out.println("In the inner class B...");
        }
    }

}
