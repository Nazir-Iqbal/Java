class A // this class extends to Object
{
    public A()
    {
        System.out.println("In the constructor of class A");
    }
    public A(int n)
    {   
        this();
        System.out.println("In the parameterised constructor of class A");
    }
}

class B extends A
{
    public B()
    {
        super(5);
        System.out.println("In the constructor of class B");
    }
    public B(int n)
    {
        this();
        System.out.println("In the parameterised constructor of class B");
    }
}

class C extends B
{
    public C()
    {   
        // super();  // this keyword is always there in every constructor
        // super(5); // calling the parameterised constructor of super class
        super(5);
        System.out.println("in the constructor of class C");
    }
    
    public C(int n){
        // this(); // calls the default constructor of this class
        this(5,6);
        System.out.println("In the parameterised constructors of class C");
    }
    public C(int a,int b){
        this();
        System.out.println("In the parameterised constructor of class C containing two variables a and b");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        C obj = new C(5);
        // System.out.println();
    }
}

