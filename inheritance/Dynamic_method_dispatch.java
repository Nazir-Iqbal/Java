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
    }
}