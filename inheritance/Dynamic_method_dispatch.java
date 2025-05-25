class A{
    public void show(){
        System.out.println("In the show method of class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In the show method of class B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In the show method of class C");
    }

    public void show1(){
        System.out.println("Another method of class C");
    }
}

class Demo
{
    public static void main(String[] args){
        A obj = new A(); // referencing to the object of class A or any subclass of A
        obj.show();
        
        obj = new B(); // referencing to the object of class B
        obj.show();

        obj = new C(); // referencing to the object of class C
        obj.show();

        // upcasting;
        A obj1 = new C();
        obj1.show();
        // obj1.show1(); // this will not work bcz class does not have method show1
        
        // downcasting
        C obj2 = (C) obj1;
        obj2.show1();
    }
}