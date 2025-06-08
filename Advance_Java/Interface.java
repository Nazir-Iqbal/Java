public class Interface{
    public static void main(String[] args){
        A obj;
        // obj = new A();      
        obj = new B();
        obj.show();
        obj.config(); 
        System.out.println(A.type);
    }
}

interface A
{
    // variables are final and staic
    String type = "Interface";
    // by default every function in the interface if public and abstract
    void show();
    void config();
}

class B implements A
{
    public void show(){
        System.out.println("In the function show....");
    }

    public void config(){
        System.out.println("In the function config...");
    }
}

// There are 3 types of interfaces
// normal interface
// functional / SAM interface
// marker