// @Deprecated
class A{
    public void show(){
        System.out.println("In the show of class A...");
    }
}

class B extends A{
    @Override // ensures that the class is overrided
    public void show(){
        System.out.println("In the show of class B...");
    }
}

public class annotations{
    public static void main(String args[]){
        A obj;
        obj = new B();
        obj.show();
    }
}